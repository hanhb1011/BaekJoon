#include <stdio.h>

int a, b, c, d ,f[101],i,l=-1,r,res;

main() {

	scanf("%d%d%d%d", &a, &b, &c, &d);
	for (i = a; i <= b; i++)
		f[i] = 1;
	for (i = c; i <= d; i++)
		f[i] = 1;

	for (i = 0; i < 101; i++) {
		if (l == -1 && f[i] == 1)
			l = i;
		else if (l != -1 && f[i] == 1)
			r = i;
		else if (l != -1 && f[i] == 0) {
			res += r - l;
			r = l = -1;
		}
		
	}
	if (l != -1)
		res += r - l;

	printf("%d", res);
}
