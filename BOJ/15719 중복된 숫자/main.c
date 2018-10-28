#include <stdio.h>

int len, n, c, i, b[1000000], idx, bits, ans;

main() {
	len = getnum();
	while (len-- > 0) {
		n = getnum();

		idx = n >> 4;
		bits = 1 << (n % 16);

		if ((b[idx] & bits) == bits)
			ans = n;

		b[idx] |= bits;
	}
	printf("%d", ans);
}

int getnum() {
	n = 0;
	c = getchar();
	while (c != EOF && c != ' ' && c != '\n') {
		n *= 10;
		n += c - 48;
		c = getchar();
	}
	return n;
}