#include <stdio.h>
#include <string.h>
int i, c, n, res, t;
char s[1000001];

main() {
	scanf("%s", s);
	n = strlen(s);
	for (i = 0; i < n; i++)
		res += s[i] - '0';
	c = n > 2 ? 1 : 0;

	while (res > 9) {
		t = 0;
		c++;
		while (res > 0) {
			t += res % 10;
			res /= 10;
		}
		
		res = t;
	}
	printf("%d\n", c);
	printf(res ==3 || res == 6 || res == 9 ? "YES" : "NO");
}
