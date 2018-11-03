#include <stdio.h>

int m,n,i,j,d,res, a[101][2], b[101][2];

main() {
	scanf("%d%d", &n, &m);
	for (i = 0; i < n; i++)
		scanf("%d%d", &a[i][0], &a[i][1]);
	for (i = 0; i < m; i++)
		scanf("%d%d", &b[i][0], &b[i][1]);
	i = j = 0;
	
	while (d < 100) {
		if (b[j][1] > a[i][1])
			res = res > b[j][1] - a[i][1] ? res : b[j][1] - a[i][1];

		if (a[i][0] > b[j][0]) {
			a[i][0] -= b[j][0];
			d += b[j][0];
			j++;
		}
		else if(a[i][0] < b[j][0]){
			b[j][0] -= a[i][0];
			d += a[i][0];
			i++;
		}
		else {
			d += a[i][0];
			i++; j++;
		}
	}

	printf("%d", res);
}