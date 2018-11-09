#include <stdio.h>
int a[1000000], f, r, i, n, c;
main() {
	scanf("%d", &n);
	for (i = 1; i <= n; i++)
		a[r++] = i;

	while (r - f > 1) {
		if (c % 2 == 0)
			f++;
		else
			a[r++] = a[f++];
		c++;
	}
		
	printf("%d", a[f]);
}