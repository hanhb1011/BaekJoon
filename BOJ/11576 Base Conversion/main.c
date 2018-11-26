#include <stdio.h>
#include <math.h>

int a, b, m, i, n, d, r;

main() {
	scanf("%d%d%d", &a, &b, &m);

	for (i = 0; i < m; i++) {
		scanf("%d", &n);
		d += ((int)pow(a, m - i-1))*n;
	}
	
	while ((int)pow(b, ++r) <= d);
	
	while (r-- > 0) {
		printf("%d ", d / (int)pow(b, r));
		d %= (int)pow(b, r);
	}
}