#include <stdio.h>
#include <stdlib.h>

int a[1<<20],i,n,k,l;

cmp(int *a, int *b) {
	return *a - *b;
}

main() {
	scanf("%d", &n);
	for (i = 0; i < n; i++)
		scanf("%d", &a[i]);
	scanf("%d", &k);
	l = n / k;

	for (i = 0; i < n; i += l)
		qsort(a + i, l, sizeof(int), cmp);

	for (i = 0; i < n; i++)
		printf("%d ", a[i]);
}