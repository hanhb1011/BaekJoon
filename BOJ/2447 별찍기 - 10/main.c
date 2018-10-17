#include <stdio.h>

char c[6561][6561];
void go(int y,int x, int n, int check) {
	if (n == 1) {
		c[y][x] = check == 1 ? '*' : ' ';
		return;
	} 
	int i, j;
	n/=3;
	for (i = 0; i < 3; i++)
		for (j = 0; j < 3; j++)
			if (i == 1 && j == 1)
				go(y+n*i, x+n*j, n, 0);
			else
				go(y+n*i, x+n*j, n, check);
}

int main() {
	int n,i,j;
	scanf("%d", &n);
	go(0, 0, n, 1);
	for (i = 0; i < n; i++) {
		for (j = 0; j < n; j++)
			printf("%c", c[i][j]);
		printf("\n");
	}

}