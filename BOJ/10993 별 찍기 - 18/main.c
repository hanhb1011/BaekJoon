#include <stdio.h>
int y, x, i, j, n, N, w[11], l[11], li, lj, ri, rj;
char a[3333][3333];
main() {
	scanf("%d", &N);
	n = N;
	for (i = 1; i <= 10; i++) {
		l[i] = l[i - 1] * 2 + 1;
		w[i] = l[i] * 2 - 1;
	}
	for (i = 0; i < l[n]; i++)
		for (j = 0; j < w[n]; j++)
			a[i][j] = ' ';

	x = w[n] / 2;
	if (n % 2 == 0)
		y = l[n] - 1;

	while (n > 0) {
		li = ri = y;
		lj = rj = x;
		if (n % 2 == 0) {

			for (i = 0; i < l[n]; i++)
				a[li--][lj--] = a[ri--][rj++] =  '*';
			for (i = 0; i < w[n]; i++)
				a[li + 1][++lj] = '*';

			y = ri + 2;
		}
		else {
			for (i = 0; i < l[n]; i++)
				a[li++][lj--] = a[ri++][rj++] = '*';
			for (i = 0; i < w[n]; i++)
				a[li - 1][++lj] = '*';

			y = ri - 2;
		}

		n--;
	}

	for (i = 0; i < l[N]; i++) {
		for (j = w[N]; a[i][j] != '*'; j--);
		a[i][++j] = '\0';
	}

	for (i = 0; i < l[N]; i++) {
		printf("%s\n", a[i]);
	}
}