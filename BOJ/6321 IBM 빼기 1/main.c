#include <stdio.h>
#include <string.h>

int t,k,i,len;
char s[99];

main() {

	scanf("%d", &t);
	for(k=1;k<=t;k++){
		scanf("%s", s);
		len = strlen(s);
		for (i = 0; i < len; i++)
			s[i] = s[i] == 'Z'? 'A' : s[i] + 1;
		printf("String #%d\n%s\n\n", k, s);
	}

}