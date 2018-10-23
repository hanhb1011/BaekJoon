#include <stdio.h>

int main() {
	int n, m, k, i, j, a[1000], c = 0;
	scanf("%d%d%d", &n, &m, &k);
	m *= k;

	for (i = 0; i < n; i++)
		scanf("%d", &a[i]);

	for (i = 0; i < n; i++) {
		int max = a[i], maxi = i;
		for (j = i + 1; j < n; j++) {
			if (max < a[j]) {
				max = a[j];
				maxi = j;
			}
		}
		c += max;
		int t = a[i];
		a[i] = a[maxi];
		a[maxi] = t;

		if (c >= m) {
			printf("%d", i + 1);
			return 0;
		}
	}
	printf("STRESS");
}