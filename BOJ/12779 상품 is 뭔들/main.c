#include <stdio.h>
#include <stdint.h>

uint64_t sqrt(uint64_t a) {
	uint64_t l = 0, r = ((uint64_t)1) << 31, m;

	while (l+1<r) {
		m = (l + r) / 2;

		if (m*m > a)
			r = m;
		else if (m*m < a)
			l = m;
		else
			return m;
	}
	return (uint64_t) l;
}

uint64_t gcd(uint64_t a, uint64_t b) {
	if (b == 0)
		return a;
	return gcd(b, a%b);
}

main() {
	uint64_t a,b,u,d,k;
	scanf("%lld%lld", &a, &b);
	u = sqrt(b) - sqrt(a);
	d = b - a;
	k = gcd(d, u);

	if (u == 0 || d == 0)
		printf("0");
	else
		printf("%lld/%lld", u / k, d / k);
}