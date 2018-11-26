#include <stdio.h>
int n, r = 99999, a[10][10], i, v[10][10], dy[5] = {0,0,0,-1,1}, dx[5] = {0,1,-1,0,0};

set(y, x, val) {
	int i,ny,nx;
	for (i = 0; i < 5; i++) {
		ny = y + dy[i];
		nx = x + dx[i];
		if (ny >= 0 && ny < n && nx >= 0 && nx < n) {
			v[ny][nx] = val;
		}
	}
}

visited(y, x) {
	int i, ny, nx;
	for (i = 0; i < 5; i++) {
		ny = y + dy[i];
		nx = x + dx[i];
		if (ny >= 0 && ny < n && nx >= 0 && nx < n && v[ny][nx] == 1) {
			return 1;
		}
	}
	return 0;
}


go(int c, int y,int x, int sum) {
	int i,j;
	if (c == 3) {
		r = sum < r ? sum : r;
		return;
	}

	for (i = 1; i < n-1; i++) {
		for (j = 1; j < n-1; j++) {
			if (visited(i, j))
				continue;

			set(i, j, 1);
			go(c + 1, i, j, sum+a[i][j]+a[i+1][j]+a[i-1][j]+a[i][j+1]+a[i][j-1]);
			set(i, j, 0);
		}
	}
	
}

main() {
	scanf("%d", &n);
	for (i = 0; i < n*n; i++)
		scanf("%d", &a[i/n][i%n]);
	
	go(0, 1, 1, 0);

	printf("%d", r);
}