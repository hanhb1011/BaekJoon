#include <stdio.h>
#include <string.h>

char a[100001],b[11];
int i, j, n, a_len, b_len,res, fail[10];

//Solved By KMP
main() {
	scanf("%s%s", a, b);
	a_len = strlen(a);
	b_len = strlen(b);
	
	for (i = 1; i < b_len; i++) {
		while (j > 0 && b[i] != b[j])
			j = fail[j-1];
		if (b[i] == b[j])
			fail[i] = ++j;
	}

	j = 0;
	
	for (i = 0; i < a_len; i++) {
		while (j > 0 && a[i] != b[j])
			j = fail[j - 1];
		if (a[i] == b[j]) {
			j++;
			if (j == b_len) {
				res++;
				j = fail[j - 1];
			}
		}

	}
	
	printf("%d", res);
}