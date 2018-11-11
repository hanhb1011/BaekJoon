#include <stdio.h>

int N, a[99][99], v[99][99], i, j, Qy[100000], Qx[100000], fy, ry = 1, fx, rx = 1, dy[2] = { 1,0 }, dx[2] = { 0,1 }, y, x, n, ny, nx;

main() {
	scanf("%d", &N);
	for (i = 0; i < N*N; i++)
		scanf("%d", &a[i/N][i%N]);

	while (fy < ry) {
		y = Qy[fy++];
		x = Qx[fx++];
		n = a[y][x];
		if (n == 0 || v[y][x] == 1)
			continue;
		v[y][x] = 1;

		if (n == -1) {
			printf("HaruHaru");
			return 0;
		}
		
		for (i = 0; i < 2; i++) {
			ny = y + n * dy[i];
			nx = x + n * dx[i];
			if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
				Qy[ry++] = ny;
				Qx[rx++] = nx;
			}
		}
		
	}
	printf("Hing");
}
