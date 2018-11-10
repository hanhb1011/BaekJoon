#include <stdio.h>

int i, j, k, l, t, n, p[100001], pnums[10000],ans[100000];


main() {

	for (i = 2; i <= 100000;i++) {
		if (p[i] == 1)
			continue;
		pnums[l++] = i;
		for (j = i + i; j <= 100000; j += i)
			p[j] = 1;
	}

	scanf("%d", &t);
	while (t-- > 0) {
		scanf("%d", &n);
		for (i = 0; i < 100000; i++)
			ans[i] = 0;
		i = 0;
		while (n > 1) {
			if (n % pnums[i] == 0) {
				n /= pnums[i];
				ans[pnums[i]]++;
			}
			else
				i++;
		}

		for (i = 0; i < 100000; i++)
			if (ans[i] > 0)
				printf("%d %d\n", i, ans[i]);
	}

}
