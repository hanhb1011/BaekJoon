#include <stdio.h>

int fail[1000000];
char A[1000001];

main() {
	int l, i, j = 0;
	scanf("%d\n%s", &l, A);

	for (int i = 1; i < l; i++) {
		while (j > 0 && A[i] != A[j])
			j = fail[j - 1];
		if (A[i] == A[j])
			fail[i] = ++j;
	}

	printf("%d", l - fail[l - 1]);
}