#include <stdio.h>
#define MAX 999999999

int n, b, h, w, r=MAX,i,c,a;

main() {
	scanf("%d%d%d%d", &n,&b,&h,&w);

	while (h-- > 0) {
		scanf("%d", &c);
		for (i = 0; i < w; i++) {
			scanf("%d", &a);
			if (a >= n && c*a <= b) {
				r = r < c*n ? r : c * n;
			}
		}
	}
	printf(r == MAX ? "stay home" : "%d\n",r);
}
