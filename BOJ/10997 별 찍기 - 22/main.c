#include <stdio.h>
int c, n, i, y, x, d, w, h, W, H, j, dy[4] = { 0,1,0,-1 }, dx[4] = { -1,0,1,0 };
char a[4000][4000];
main() {
	scanf("%d", &n);
	W = (n * 2 - 1) * 2 - 1;
	H = W + 2;
	w = W;
	h = H;
	for (i = 0; i < h * h; i++)
		a[i / h][i % h] = ' ';
	x = w - 1;

	if (n == 1) {
		printf("*\n");
		return 0;
	}
	while (h >= 3) {
		for (c = 0; c < (d % 2 == 0 ? w : h); c++) {
			a[y][x] = '*';
			y += dy[d];
			x += dx[d];
		}
		y -= dy[d];
		x -= dx[d];
		h -= d % 2 == 1 ? 2 : 0;
		w -= d % 2 == 0 && j++ > 0 ? 2 : 0;
		d = (d + 1) % 4;
	}

	a[1][1] = '\0';
	for (i = 0; i < H; i++) {
		a[i][W] = '\0';
		printf("%s\n", a[i]);
	}
}