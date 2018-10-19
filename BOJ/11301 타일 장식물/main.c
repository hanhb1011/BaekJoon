#include <stdio.h>
#include <stdint.h>

int main() {
	
	int n,i;
	scanf("%d", &n);
	uint64_t dp[81];
	dp[1] = dp[2] = 1;
	for (i = 3; i < 81; i++)
		dp[i] = dp[i - 1] + dp[i - 2];
	printf("%lld", n==1? 4 : (dp[n] * 4) + dp[n - 1] * 2);
}