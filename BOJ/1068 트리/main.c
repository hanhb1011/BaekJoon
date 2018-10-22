#include <stdio.h>
#define M 51
int res=0, child[M][M], c_size[M];

main() {
	int n,node,i,j,k,tree;
	for (i = 0; i < M*M; i++)
		child[i/M][i%M] = -1;
	scanf("%d", &n);
	for (i = 0; i < n; i++) {
		scanf("%d", &node);
		if (node >= 0)
			child[node][c_size[node]++] = i;
		if (node == -1)
			tree = i;
	}
	scanf("%d", &node);
	c_size[node] = 0;
	for(i=0;i<M;i++)
		for(j=0;j<M;j++)
			if (child[i][j] == node) {
				for (k = j; k < c_size[i]; k++)
					child[i][k] = child[i][k + 1];
				c_size[i]--;
				break;
			}
	if(tree != node)
		go(tree);
	printf("%d", res);
}

go(int n) {
	if (c_size[n] == 0) {
		res++;
		return;
	}
	
	int i;
	for (i = 0; i < c_size[n]; i++)
		if(child[n][i] !=-1)
			go(child[n][i]);
}