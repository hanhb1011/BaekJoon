#include <stdio.h>
#include <string.h>

int y, x, i, j, k, res=0, hor[500][500], ver[500][500];
char a[500][500];

main() {
	scanf("%d%d", &y, &x);

	for (i = 0; i < y; i++)
		scanf("%s", a[i]);

	
	for (i = 0; i < y; i++)
		for (j = 0; j < x; j++) {
			int c = 0;
			for (k = j; k < x && a[i][k] == '.'; k++)
				c++;
			hor[i][j] = c;
		}
	for (i = 0; i < y; i++)
		for (j = 0; j < x; j++) {
			int c = 0;
			for (k = i; k < y && a[k][j] == '.'; k++)
				c++;
			ver[i][j] = c;
		}

	for (i = 0; i < y; i++)
		for (j = 0; j < x; j++) {
			int len = hor[i][j], c = 0;
			if (len == 0)
				continue;

			for (k = i; k < y && len == hor[k][j]; k++)
				c++;

			res = res > len * 2 + c * 2 - 1 ? res : len * 2 + c * 2 - 1;
		}

	for (i = 0; i < y; i++)
		for (j = 0; j < x; j++) {
			int len = ver[i][j], c = 0;
			if (len == 0)
				continue;

			for (k = j; k < x && len == ver[i][k]; k++)
				c++;

			res = res > len * 2 + c * 2 - 1 ? res : len * 2 + c * 2 - 1;
		}

	printf("%d", res);
}