#include <stdio.h>
#include <stdint.h>

int64_t k, a, b, t, r;
main() {
	scanf("%lld%lld%lld", &k, &a, &b);
	
	if (a < 0 && b <= 0) {
		t = -a;
		a = -b;
		b = t;
	}
	if (a >= 0) {
		r = b / k - a / k + (a%k == 0 ? 1 : 0);
	}
	else {
		a = -a;
		r = b / k + a / k + 1;
	}

	printf("%lld", r);
}
