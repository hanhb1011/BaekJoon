#include <stdio.h>
#include <stdint.h>


main() {
	int i,j,n;
	uint64_t t[36] = { 0 };

	scanf("%d", &n);
	t[0] = 1;

	for (i = 1; i <= n; i++) {
		uint64_t k = 0;
		for (j = 0; j < i; j++)
			k += t[j] * t[i - j -1];
		t[i] = k;
	}
	printf("%lld", t[n]);
}