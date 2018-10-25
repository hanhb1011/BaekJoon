#include <stdio.h>
#include <string.h>

char s[1001];
int l, i, r, len, dp[1000][1000];

main() {
	scanf("%s", s);
	len = strlen(s);

	for (i = 0; i < len; i++)
		dp[i][i] = s[i] - '0';

	for (l = 1; l < len; l++)
		for (i = 0; i + l < len; i++)
			dp[i][i + l] = dp[i + l][i] = dp[i][i + l - 1] + dp[i + l][i + l];

	for (l = 0; l < len; l++)
		for (i = 0; i + 1 + l * 2 < len; i++)
			if (dp[i][i + l] == dp[i + l + 1][i + 1 + l * 2])
				r = r > (l + 1) * 2 ? r : (l + 1) * 2;

	printf("%d", r);
}