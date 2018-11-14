#include <stdio.h>

int n, i,j,c,a[1000];
main() {
	scanf("%d", &n);
	for (i = 0; i < n; i++) {
		c = 0;
		scanf("%d", &a[i]);
		for (j = 0; j < i; j++)
			if (a[j] < a[i])
				c++;
		printf("%d\n", c);
	}
}