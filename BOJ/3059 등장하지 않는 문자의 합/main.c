#include <stdio.h>

char s[2000];

main() {
	int t;
	scanf("%d", &t);

	while (t-- > 0) {

		char c;
		int i = 0, a[91] = { 0 },res=0;
		scanf("%s", s);
		
		while ((c = s[i++]) != '\0') {
			a[c] = 1;
		}
		for (i = 65; i <= 90; i++)
			if (a[i] == 0)
				res += i;
		printf("%d\n", res);
	
	}

}