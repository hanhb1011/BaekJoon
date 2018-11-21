#include <stdio.h>
#include <math.h>
#define MAX 999999999
int t, n, sum[500], dp[500][500],i,j,l,k;

main() {
	scanf("%d", &t);
	while (t-- > 0) {
		scanf("%d", &n);
		for (i = 0; i < n; i++)
			for (j = 0; j < n; j++)
				dp[i][j] = 0;

		for (i = 0; i < n; i++) {
			scanf("%d", &sum[i]);
			dp[i][i] = sum[i];
			if (i > 0)
				sum[i] += sum[i - 1];
		}

		for (l = 1; l < n; l++) {
			for (i = 0; i < n - l; i++) {
				int min = MAX;
				for (j = i; j < i + l; j++) {
					int a = (i==j?0:dp[i][j]) + (j+1==i+l?0:dp[j + 1][i + l]);
					min = min < a ? min : a;
				}
				dp[i][i + l] = min + sum[i + l] - (i > 0 ? sum[i - 1] : 0);
			}
		}
		printf("%d\n", dp[0][n-1]);
	}

}
