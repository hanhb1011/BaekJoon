#include <stdio.h>

int n, i, j, k, stat;
char s[999][999];

main() {
	scanf("%d", &n);
	for (i = 0; i < n; i++)
		scanf("%s", s[i]);
	scanf("%d", &stat);
	if (stat == 2)
	{
		for (i = 0; i < n; i++) {
			for (j = n - 1; j >= 0; j--)
				printf("%c", s[i][j]);
			printf("\n");
		}
	}
	else if (stat == 3)
		for (i = n - 1; i >= 0; i--)
			printf("%s\n", s[i]);
	else
		for (i = 0; i < n; i++)
			printf("%s\n", s[i]);
}