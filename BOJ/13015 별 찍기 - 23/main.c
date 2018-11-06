#include <stdio.h>

int n,h,w,i,j,li,lj,ri,rj;
char a[500][500];

main() {
	scanf("%d", &n);
	rj = n * 3 - 3;
	w = 4 * n - 3;
	h = 2 * n - 1;
	for (i = 0; i < h; i++)
		for (j = 0; j < w; j++)
			a[i][j] = ' ';

	for (i = 0; i < n; i++)
		a[li][lj + i] = a[ri][rj + i] = a[li + h - 1][lj + i] = a[li + h - 1][rj + i] = '*';
	for (i = 0; i < h/2; i++)
		a[li][lj] = a[li++][lj++ + n - 1] = a[ri][rj] = a[ri++][rj-- + n - 1] = '*';
	for (i = 0; i < h / 2; i++)
		a[li][lj] = a[li++][lj-- + n - 1] = a[ri][rj] = a[ri++][rj++ + n - 1] = '*';

	for (i = 0; i < h; i++) {
		for (j = w; a[i][j] != '*'; j--);
		a[i][++j] = '\0';
		printf("%s\n", a[i]);
	}

}