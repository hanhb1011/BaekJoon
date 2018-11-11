#include <stdio.h>
int n, k, l, i, j, y, x, a[100][100], Qi[99999], Qj[99999], fi, ri = 1, fj, rj = 1, d, dir[100][2], t, next, dy[4] = { 0,1,0,-1 }, dx[4] = { 1,0,-1,0 }, r;
char b;

main() {
	scanf("%d%d", &n, &k);
	while (k-- > 0) {
		scanf("%d%d", &y, &x);
		a[y - 1][x - 1] = 1;
	}
	scanf("%d", &l);
	for (i = 0; i < l; i++) {
		scanf("%d%s", &j, &b);
		dir[i][0] = j;
		dir[i][1] = b == 'L' ? -1 : 1;
	}
	y = x = 0;
	a[0][0] = 2;

	while (1) {
		t++;
		y += dy[d];
		x += dx[d];

		if (y < 0 || y >= n || x < 0 || x >= n || a[y][x] == 2)
			break;
		else if (a[y][x] == 0)
			a[Qi[fi++]][Qj[fj++]] = 0;

		a[y][x] = 2;
		Qi[ri++] = y;
		Qj[rj++] = x;
		if (next < l&&t == dir[next][0])
			d = (d + dir[next++][1] + 4) % 4;
	}
	printf("%d", t);
}