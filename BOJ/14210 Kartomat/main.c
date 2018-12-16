#include <stdio.h>
#include <string.h>

int n,len,in_len,i,j,c;
char list[50][101], input[101], key[4][9];

main() {
	scanf("%d", &n);
	for (i = 0; i < n; i++)
		scanf("%s", list[i]);
	for (i = 0; i < 32; i++)
		key[i / 8][i % 8] = '*';
	scanf("%s", input);
	in_len = strlen(input);

	for (i = 0; i < n; i++) {
		len = strlen(list[i]);
		if(len<=in_len)
			continue;

		if (strncmp(input, list[i], in_len) == 0) {
			c = 3+list[i][in_len]-'A';
			key[c / 8][c % 8] = list[i][in_len];
		}
	}

	for (i = 0; i < 4; i++)
		printf("%s\n", key[i]);
}