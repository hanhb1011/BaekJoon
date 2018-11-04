#include <stdio.h>

int n, m, dy[4] = { 1,-1,0,0 }, dx[4] = { 0,0,-1,1 }, res = 11;
char a[22][22], buf[22], log[22], w[5] = "DULR";

main() {
	int ry, rx, by, bx, i, j;
	scanf("%d%d", &n, &m);
	for (i = 0; i < n; i++) {
		scanf("%s", a[i]);
		for (j = 0; j < m; j++)
			if (a[i][j] == 'R') {
				ry = i;
				rx = j;
			}
			else if (a[i][j] == 'B') {
				by = i;
				bx = j;
			}
	}

	a[by][bx] = a[ry][rx] = '.';
	
	go(0, -1, ry, rx, by, bx);
	printf("%d\n", res == 11 ? -1 : res);
	if (res != 11)
		printf("%s", log);

}

int move_blue(int d, int *ry, int *rx, int *by, int *bx) {
	while (!(*by + dy[d] == *ry && *bx + dx[d] == *rx) && a[*by + dy[d]][*bx + dx[d]] == '.' || a[*by + dy[d]][*bx + dx[d]] == 'O') {
		*by += dy[d];
		*bx += dx[d];
		if (a[*by][*bx] == 'O')
			return 1;
	}
	return 0;
}

int move_red(int d, int *ry, int *rx, int *by, int *bx) {
	while (!(*ry + dy[d] == *by && *rx + dx[d] == *bx) && a[*ry + dy[d]][*rx + dx[d]] == '.' || a[*ry + dy[d]][*rx + dx[d]] == 'O') {
		*ry += dy[d];
		*rx += dx[d];
		if (a[*ry][*rx] == 'O')
			return 1;
	}
	return 0;
}

go(int c, int d, int ry, int rx, int by, int bx) {
	int i, res_red = -1, res_blue = -1;
	
	if (c > 10) {
		return;
	}

	if (c > 0) {
		buf[c - 1] = w[d];
		if (d == 0 && rx == bx) {
			if (ry > by) {
				res_red = move_red(d, &ry, &rx, &by, &bx);
				res_blue = move_blue(d, &ry, &rx, &by, &bx);
			}
			else {
				res_blue = move_blue(d, &ry, &rx, &by, &bx);
				res_red = move_red(d, &ry, &rx, &by, &bx);
			}

		}
		else if (d == 1 && rx == bx) {
			if (ry > by) {
				res_blue = move_blue(d, &ry, &rx, &by, &bx);
				res_red = move_red(d, &ry, &rx, &by, &bx);
			}
			else {
				res_red = move_red(d, &ry, &rx, &by, &bx);
				res_blue = move_blue(d, &ry, &rx, &by, &bx);
			}
		}
		else if (d == 2 && ry == by) {
			if (rx > bx) {
				res_blue = move_blue(d, &ry, &rx, &by, &bx);
				res_red = move_red(d, &ry, &rx, &by, &bx);
			}
			else {
				res_red = move_red(d, &ry, &rx, &by, &bx);
				res_blue = move_blue(d, &ry, &rx, &by, &bx);
			}
		}
		else if (d == 3 && ry == by) {
			if (rx > bx) {
				res_red = move_red(d, &ry, &rx, &by, &bx);
				res_blue = move_blue(d, &ry, &rx, &by, &bx);
			}
			else {
				res_blue = move_blue(d, &ry, &rx, &by, &bx);
				res_red = move_red(d, &ry, &rx, &by, &bx);
			}
		}
		else {
			res_blue = move_blue(d, &ry, &rx, &by, &bx);
			res_red = move_red(d, &ry, &rx, &by, &bx);
		}

		if (res_blue == 1) {
			return;
		}
		if (res_red == 1) {
			if (res > c) {
				for (i = 0; i < c; i++)
					log[i] = buf[i];
				log[c] = '\0';
				res = c;
			}

			return;
		}

	}

	for (i = 0; i < 4; i++) {
		if (d == i)
			continue;
		go(c + 1, i, ry, rx, by, bx);
	}
}