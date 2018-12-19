#include <stdio.h>

int board[101][101], n, dy[4]={0,-1,0,1}, dx[4]={1,0,-1,0},i,j,c;

draw(int x,int y,int dir,int gen){
	int arr[1025] = {0,};
	arr[0] = dir;
	int g,i,j;

	for (g=1; g<=gen; g++) {
		j=1;
		for (i = (1<<(g-1)); i<=(1<<g)-1; i++) {
			arr[i] = (arr[i-j]+1) % 4;
			j+=2;
		}
	}

	board[y][x]=1;
	for (i=0; i<(1<<(gen)); i++) {
		x += dx[arr[i]];
		y += dy[arr[i]];
		board[y][x]=1;
	}
}

main(){
	scanf("%d",&n);

	while (n--){
		int x,y,d,g;
		scanf("%d%d%d%d",&x,&y,&d,&g);
		draw(x,y,d,g);
	}

	for (i = 0; i < 100; i++)
		for (j = 0; j < 100; j++)
			if (board[i][j]==1 && board[i][j+1]==1 && board[i+1][j]==1 && board[i+1][j+1]==1)
				c++;

	printf("%d",c);
}
