#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int l,i,j,len,p_len,p[100000], pnum[10000],v,max;
char s[300], buf[100];

main() {

	for (i = 2; i < 100000; i++) {
		if (p[i] != 0)
			continue;
		pnum[p_len++] = i;
		for (j = i + i; j < 100000; j += i)
			p[j] = 1;
	}

	scanf("%s", s);
	
	while (strcmp(s,"0") != 0) {
		len = strlen(s);
		max = 0;
		for (l = 1; l < 6; l++) {

			for (i = 0; i < len - l; i++) {
				strncpy(buf, &s[i], l);
				buf[l] = '\0';
				v = atoi(buf);

				for (j = 0; j < p_len; j++) {
					if (v == pnum[j]) {
						max = max > v ? max : v;
						break;
					}
				}
			}
		}
		printf("%d\n", max);

		scanf("%s", s);
	}

}
