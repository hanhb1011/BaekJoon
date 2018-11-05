#include <stdio.h>
int n, N, i, j, y, x, w,W;
char a[4000][4000];
main() {
	scanf("%d", &N);
	W = (N * 2 - 1) * 2 - 1;
	for (i = 0; i < W * W; i++)
		a[i / W][i % W] = ' ';
	n = N;

	while (n > 0) {
		w = (n * 2 - 1) * 2 - 1;
		for (i = 0; i < w; i++)
			a[y][x + i] = a[y + i][x] = a[y + w - i - 1][x + w-1] = a[y + w-1][x + w - i - 1] = '*';
		y=x=x+2;
		n--;
	}
	
	for (i = 0; i < W; i++) {
		a[i][W] = '\0';
		printf("%s\n", a[i]);
	}
}