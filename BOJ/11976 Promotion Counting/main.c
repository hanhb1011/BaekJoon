#include <stdio.h>


int a[4][2],i,j, ans[3];
main() {
	for (i = 0; i < 4; i++)
		for (j = 0; j < 2; j++)
			scanf("%d", &a[i][j]);

	for (i = 3; i > 0; i--) {
		if (a[i][0] < a[i][1]) {
			int promoted = a[i][1] - a[i][0];
			a[i - 1][0] -= promoted;
			ans[i - 1] = promoted;
		}
	}
	
	for (i = 0; i < 3; i++)
		printf("%d\n", ans[i]);
}
