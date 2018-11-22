#include <stdio.h>

main(n,a) {
	scanf("%d", &n);

	while (n != 0) {
		while (n/10 > 0) {
			printf("%d ", n);
			a = n % 10;
			while (n/10> 0) {
				n /= 10;
				a *= (n % 10);
			}
			n = a;
		}

		printf("%d\n",n);
		scanf("%d", &n);
	}

}
