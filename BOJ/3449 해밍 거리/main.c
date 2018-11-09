#include <stdio.h>
#include <string.h>

int t, i, len, c;
char a[101], b[101];

main() {
	scanf("%d", &t);
	while (t-- > 0) {
		c = 0;
		scanf("%s%s", a, b);
		len = strlen(a);
		for (i = 0; i < len; i++)
			if (a[i] != b[i])
				c++;
		printf("Hamming distance is %d.\n", c);
	}

}