#include <stdio.h>

int n, i, j, k, y, x, d, done, dy[4] = { 0,1,1,1 }, dx[4] = { 1,1,0,-1 };
char b[33][33], c;
main() {
	scanf("%d", &n);
	for (i = 0; i < n; i++)
		scanf("%s", b[i]);

	for (i = 0; i < n; i++) {
		for (j = 0; j < n; j++) {
			if (b[i][j] == '.')
				continue;
			for (k = 0; k < 4; k++) {
				done = 1;
				c = b[i][j];
				y = i;
				x = j;
				for (d = 0; d < 2; d++) {
					y += dy[k];
					x += dx[k];
					if (c != b[y][x] || y<0 || y>n || x<0 || x>n) {
						done = 0;
						break;
					}
				}
				if (done) {
					printf("%c", c);
					return 0;
				}
			}

		}
	}

	printf("ongoing");
}
