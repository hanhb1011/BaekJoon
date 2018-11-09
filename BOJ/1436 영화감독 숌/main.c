#include <stdio.h>

int N,n,i,c,cnt;
main() {
	scanf("%d", &N);
	for (i = 666; i < 10000000; i++) {
		n = i;
		c = 0;
		while (n > 0) {
			if (n % 10 == 6)
				c++;
			else
				c = 0;
			n /= 10;
			if (c == 3) {
				cnt++;
				break;
			}
		}

		if (N == cnt) {
			printf("%d\n", i);
			return 0;
		}
	}
}
