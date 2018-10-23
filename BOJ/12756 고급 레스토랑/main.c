#include <stdio.h>

main() {
	int a, b, c, d;
	scanf("%d%d%d%d", &a, &b, &c, &d);
	while (b > 0 && d > 0) {
		d -= a;
		b -= c;
	}
	printf(b <= 0 && d <= 0 ? "DRAW" : d <= 0 ? "PLAYER A" : "PLAYER B");
}