#include <stdio.h>

main(){
	int a, b, c;
	scanf("%d%d%d", &a, &b, &c);
	if (a > b)
		printf("%d", b + c > a ? a*2 + ((b + c - a) / 2)*2 : (b + c) * 2);
	else if (a < b)
		printf("%d", a + c > b ? b*2 + ((a + c - b) / 2)*2 : (a + c) * 2);
	else
		printf("%d", a + b + (c / 2) * 2);

}