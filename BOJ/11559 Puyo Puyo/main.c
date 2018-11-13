#include <stdio.h>

int i, j, k, r, m[12][6], dy[4] = { 0,0,1,-1 }, dx[4] = { 1,-1,0,0 }, v[12][6], cnt, modified;
char a[33][33], t;

clr(int a[][6]) {
	int i, j;
	for (i = 0; i < 12; i++)
		for (j = 0; j < 6; j++)
			a[i][j] = 0;
}

dfs(int y, int x) {
	int i;
	v[y][x] = 1;
	for (i = 0; i < 4; i++) {
		int ny = y + dy[i], nx = x + dx[i];
		if (ny >= 0 && ny < 12 && nx >= 0 && nx < 6 && v[ny][nx] == 0 && a[ny][nx] == a[y][x]) {
			cnt++;
			dfs(ny, nx);
		}
	}

	for (i = 0; i < 4; i++) {
		int ny = y + dy[i], nx = x + dx[i];
		if (ny >= 0 && ny < 12 && nx >= 0 && nx < 6 && a[ny][nx] == a[y][x] && cnt >= 4) {
			m[ny][nx] = 1;
		}
	}

	if (cnt >= 4)
		m[y][x] = 1;
}

main() {
	for (i = 0; i < 12; i++)
		scanf("%s", a[i]);

	while (1) {
		modified = 0;
		clr(m);
		clr(v);

		for (i = 11; i >= 0; i--)
			for (j = 0; j < 6; j++)
				if (v[i][j] == 0 && a[i][j] != '.') {
					cnt = 1;
					dfs(i, j);
					if (cnt >= 4)
						modified = 1;
				}


		for (i = 0; i < 12; i++)
			for (j = 0; j < 6; j++)
				if (m[i][j] == 1)
					a[i][j] = '.';


		for (j = 0; j < 6; j++) {
			k = 11;
			while (k >= 0) {
				if (a[k][j] == '.')
					break;
				k--;
			}

			for (i = k - 1; i >= 0; i--) {
				if (a[i][j] != '.') {
					t = a[i][j];
					a[i][j] = a[k][j];
					a[k][j] = t;
					k--;
				}
			}
		}

		if (modified)
			r++;
		else
			break;
	}

	printf("%d", r);
}