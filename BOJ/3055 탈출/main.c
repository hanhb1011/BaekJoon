#include <stdio.h>

int Y, X, i, j, des_y, des_x, src_y, src_x, Qi[200000], Qj[200000], fi, ri, fj, rj, w[50][50], v[50][50], t[50][50], y, x, ny, nx, dy[4] = { 1,-1,0,0 }, dx[4] = { 0,0,-1,1 };
char a[99][99];
main() {
	scanf("%d%d", &Y, &X);
	for (i = 0; i < Y; i++) {
		scanf("%s", a[i]);
		for (j = 0; j < X; j++)
			if (a[i][j] == 'D') {
				des_y = i;
				des_x = j;
			}
			else if (a[i][j] == 'S') {
				src_y = i;
				src_x = j;
			}
			else if (a[i][j] == '*') {
				Qi[ri++] = i;
				Qj[rj++] = j;
			}
	}

	//water
	while (fi < ri) {
		y = Qi[fi++];
		x = Qj[fj++];
		v[y][x] = 1;

		for (i = 0; i < 4; i++) {
			ny = y + dy[i];
			nx = x + dx[i];
			if (ny >= 0 && ny < Y && nx >= 0 && nx < X && v[ny][nx] == 0 && a[ny][nx] == '.') {
				Qi[ri++] = ny;
				Qj[rj++] = nx;
				w[ny][nx] = w[y][x] + 1;
				v[ny][nx] = 1;
			}
		}
	}

	//go
	fi = ri = fj = rj = 0;
	Qi[ri++] = src_y;
	Qj[rj++] = src_x;
	for (i = 0; i < Y; i++)
		for (j = 0; j < X; j++)
			v[i][j] = 0;

	while (fi < ri) {
		y = Qi[fi++];
		x = Qj[fj++];
		v[y][x] = 1;

		for (i = 0; i < 4; i++) {
			ny = y + dy[i];
			nx = x + dx[i];
			if (ny >= 0 && ny < Y && nx >= 0 && nx < X && v[ny][nx] == 0 && ((a[ny][nx] == '.' && (t[y][x] + 1 < w[ny][nx] || w[ny][nx] == 0)) || (a[ny][nx] == 'D'))) {
				Qi[ri++] = ny;
				Qj[rj++] = nx;
				t[ny][nx] = t[y][x] + 1;
				v[ny][nx] = 1;
			}
		}
	}

	if (t[des_y][des_x] > 0)
		printf("%d", t[des_y][des_x]);
	else
		printf("KAKTUS");
}