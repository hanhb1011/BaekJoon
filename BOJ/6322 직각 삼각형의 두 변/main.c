#include <stdio.h>
#include <math.h>

int a, b, c, i, found;
double res;

main() {

	while (1) {
		scanf("%d%d%d", &a, &b, &c);
		if (a == 0 && b == 0 && c == 0)
			break;
		printf("Triangle #%d\n", ++i);
		if (a == -1) {
			b *= b; c *= c;
			if (c - b > 0)
				printf("a = %.3f\n\n", sqrt(c - b));
			else
				printf("Impossible.\n\n");
		}
		else if(b==-1){
			a *= a; c *= c;
			if (c - a > 0)
				printf("b = %.3f\n\n", sqrt(c - a));
			else
				printf("Impossible.\n\n");
		}
		else {
			a *= a; b *= b;
			if (a > 0 && b > 0)
				printf("c = %.3f\n\n", sqrt(a + b));
			else
				printf("Impossible.\n\n");
		}
	}

}