#include <stdio.h>

main() {
	int t, m, i;
	char c, a[500];
	scanf("%d", &t);

	while (t-- > 0) {
		scanf("%d %c", &m, &c);
		if (c == 'C') {
			for (i = 0; i < m; i++)
				scanf("%s", &a[i]);
			for (i = 0; i < m; i++)
				printf("%d ", a[i] - 64);
		}
		else {
			for (i = 0; i < m; i++)
				scanf("%d ", &a[i]);
			for (i = 0; i < m; i++)
				printf("%c ", a[i] + 64);
		}
		printf("\n");
	}

}