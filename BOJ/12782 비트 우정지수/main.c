#include <stdio.h>
#include <string.h>

int t,i,one,zero,len,res;
char a[1000001], b[1000001];

main() {
	
	scanf("%d", &t);
	while (t-- > 0) {
		one = zero = i = res = 0;
		scanf("%s %s", a, b);
		len = strlen(a);
		for (i = 0; i < len; i++) 
			if (a[i] != b[i])
				if (a[i] == '0')
					zero++;
				else
					one++;
		res = zero > one ? zero : one;
		printf("%d\n", res);
	}

}