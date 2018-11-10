#include <stdio.h>


int t, n, m, i, a, b, y, x, ans, mos[100][2],caught[100];

main() {
	scanf("%d", &t);

	while (t-- > 0) {
		ans = 0;
		scanf("%d", &n);
		for (i = 0; i < n; i++) {
			scanf("%d%d", &y, &x);
			mos[i][0] = y;
			mos[i][1] = x;
			caught[i] = 0;
		}
		
		scanf("%d", &m);
		while (m-->0) {
			scanf("%d%d", &a, &b);

			for (i = 0; i < n; i++) {
				y = mos[i][0];
				x = mos[i][1];
				
				if (caught[i] == 0 && a - 50 <= y && y <= a + 50 && b - 50 <= x && x <= b + 50) {
					ans++;
					caught[i] = 1;
				}
			}
		}
		printf("%d\n", ans);

	}
}
