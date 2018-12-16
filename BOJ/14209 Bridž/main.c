#include <stdio.h>
#include <string.h>

int n,i,res;
char s[20];

main() {
	scanf("%d", &n);
	while (n-- > 0) {
		scanf("%s", &s);
		for (i = 0; i < 13; i++)
			if (s[i] == 'A') res += 4;
			else if (s[i] == 'K') res += 3;
			else if (s[i] == 'Q') res += 2;
			else if (s[i] == 'J') res += 1;
	}
	printf("%d", res);
}