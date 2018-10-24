#include <stdio.h>
#include <stdint.h>

uint64_t gcd(int a, int b) {
	if (b == 0)
		return a;
	return gcd(b, a%b);
}

main() {
	int t;
	scanf("%d", &t);

	while (t-- > 0) {
		uint64_t a, b, c;
		scanf("%lld%lld", &a, &b);
		c = gcd(a, b);
		printf("%lld\n", a*b/c);
	}

}