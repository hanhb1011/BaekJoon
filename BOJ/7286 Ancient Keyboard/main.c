#include <stdio.h>

int t,n,i,j;
char c;

main() {

	scanf("%d", &t);
	
	while (t-- > 0) {
		scanf("%d", &n);
		int a[1001] = { 0 };
		while (n-- > 0) {
			scanf("%s %d %d", &c,&i,&j);
			for (; i < j; i++)
				a[i]++;
		}

		for (i = 0; i <= 1000; i++)
			if (a[i] > 0)
				printf("%c", a[i] + 'A' -1);
		printf("\n");

	}

}