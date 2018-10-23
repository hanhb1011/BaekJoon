#include <stdio.h>

int n,m,a[10],v[10];

go(int i, int c) {
	int k;
	if (c == m) {
		for (k = 0; k < m; k++)
			printf("%d ", a[k]);
		printf("\n");
		return;
	}

	for (k = 0; k < n; k++) {
		if (v[k] == 0) {
			v[k] = 1;
			a[c] = k + 1;
			go(k, c + 1);
			v[k] = 0;
		}
	}
}

main() {
	
	scanf("%d%d", &n, &m);
	go(0,0);
	
}