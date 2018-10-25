#include <stdio.h>

int y, x, i, j, a, b;
char s[101][101];

main(){
	scanf("%d%d", &y, &x);
	for (i = 0; i < y; i++)
		scanf("%s", s[i]);
	scanf("%d%d", &a, &b);

	for (i = 0; i < y; i++)
		for (j = x; j < x * 2; j++)
			s[i][j] = s[i][x * 2 - j - 1];

	for (i = y; i < y * 2; i++)
		for (j = 0; j < x * 2; j++)
			s[i][j] = s[y * 2 - i - 1][j];

	s[a - 1][b - 1] = s[a - 1][b - 1] == '.' ? '#' : '.';

	for (i = 0; i < y*2; i++) {
		for (j = 0; j < x * 2; j++)
			printf("%c", s[i][j]);
		printf("\n");
	}
}