#include <stdio.h>
#include <stdint.h>

uint64_t gcd(uint64_t a, uint64_t b) {
	if (b == 0)
		return a;
	return gcd(b, a%b);
}

main() {
	uint64_t a, b, c;
	scanf("%lld%lld", &a, &b);
	c = gcd(a,b);
	printf("%lld", a*b / c);
}