#include <stdio.h>
#include <string.h>

int a, b, t, i,l;
char s[1000001];

main() {

	scanf("%d", &t);
	while (t-- > 0) {
		scanf("%d%d%s", &a, &b, s);
		l = strlen(s);

		for (i = 0; i < l; i++)
			s[i] = ((s[i] - 'A')*a + b) % 26 + 'A';
		printf("%s\n", &s);
	}
}