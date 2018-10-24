#include <stdio.h>


main() {
	int a, b, c, i;
	scanf("%d%d%d", &a, &b, &c);
	if(c%2==1)
		a ^= b;
	printf("%d", a);
}