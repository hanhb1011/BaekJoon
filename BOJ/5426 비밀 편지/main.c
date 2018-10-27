#include <stdio.h>
#include <math.h>
#include <string.h>

char s[10001];
int t, i, j, len, sq;

main(){
	scanf("%d", &t);
	while (t-->0) {
		scanf("%s", s);
		len = strlen(s);
		sq = (int)sqrt(len);
		for (i = sq - 1; i >= 0; i--)
			for (j = 0; j < sq; j++)
				printf("%c", s[j*sq + i]);
		printf("\n");
	}
}