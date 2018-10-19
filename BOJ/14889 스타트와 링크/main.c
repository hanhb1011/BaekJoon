#include <stdio.h>
#include <math.h>

ans = 100000000;
go(int a[][20], int n, int c,int idx, int v[]) {
	int i,j;
	if (c == n/2) {
		int sum[2] = { 0, 0 };
		for (i = 0; i < n; i++)
			for (j = 0; j < n; j++)
				if (v[i] == 0 && v[j] == 0)
					sum[0] += a[i][j];
				else if (v[i] == 1 && v[j] == 1)
					sum[1] += a[i][j];
		ans = ans < abs(sum[0]-sum[1]) ? ans : abs(sum[0] - sum[1]);
		return;
	}

	for (i = idx; i < n; i++)
		if (v[i] == 0) {
			v[i] = 1;
			go(a, n, c + 1, i, v);
			v[i] = 0;
		}	
}

int main() {
	int n, i, j, a[20][20], v[20] = { 0 };
	scanf("%d", &n);
	for (i = 0; i < n*n; i++)
		scanf("%d", &a[i/n][i%n]);

	go(a, n, 0, 0, v);
	printf("%d", ans);
}