#include <stdio.h>

int p[1001], i, j, n, m, e, a[1000];

find(v) {
	if (p[v] == v)
		return v;
	return p[v] = find(p[v]);
}

union_(a, b) {
	int pa = find(a);
	int pb = find(b);

	if(pa != pb)
		p[pa] = pb;
}

main() {
	scanf("%d%d", &n, &m);
	for (i = 1; i <= 1000; i++)
		p[i] = i;
	
	for (i = 1; i <= n; i++)
		for (j = 1; j <= n; j++) {
			scanf("%d", &e);
			if (e == 1)
				union_(i, j);
		}
	for (i = 0; i < m; i++) {
		scanf("%d", &e);
		a[i] = find(e);
		if (i > 0 && a[i] != a[i - 1]) {
			printf("NO");
			return 0;
		}
	}
	printf("YES");
}