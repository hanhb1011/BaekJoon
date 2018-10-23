#include <stdio.h>
#include <string.h>

main() {
	char s[300], c;
	fgets(s, 300, stdin);
	while (strcmp(s, "#\n") != 0) {
		int i = 0, a[26] = { 0, }, r = 0;
		while ((c = s[i++]) != '\0') {
			if (c >= 97 && c <= 122)
				a[c - 97] = 1;
			else if (c >= 65 && c <= 90)
				a[c - 65] = 1;
		}

		for (i = 0; i < 26; i++)
			if (a[i] == 1)
				r++;
		printf("%d\n", r);
		fgets(s, 300, stdin);
	}
}