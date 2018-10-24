#include <stdio.h>
#include <string.h>

char a[100001],b[11];
int i, j, n, a_len, b_len,res=0;

main() {
	scanf("%s%s", a, b);
	a_len = strlen(a);
	b_len = strlen(b);
	for (i = 0; i < a_len - b_len + 1; i++) {
		int found = 1;
		for (j = 0; j < b_len; j++) {
			if (a[i+j] != b[j]) {
				found = 0;
				break;
			}
		}
		if (found==1)
			res++;
	}
	printf("%d", res);
}