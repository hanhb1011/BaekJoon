#include <stdio.h>

main(n,i) {
	scanf("%d", &n);
	for (i = 0; i < n*n; i++)
		printf(i != 0 && i%n == 0 ? "\n*" : "*");
}