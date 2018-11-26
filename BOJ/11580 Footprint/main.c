#include <stdio.h>

int l, y, x, i,v[2222][2222],c;
char s[1001];
main() {
	scanf("%d%s", &l, s);
	for (i = 0; i < l+1; i++) {
		if (v[y+1000][x+1000] == 0)
			c++;
		v[y+1000][x+1000]=1;

		if (s[i] == 'E')
			x -= 1;
		else if(s[i] == 'W')
			x += 1;
		else if (s[i] == 'S')
			y += 1;
		else
			y -= 1;
	}
	printf("%d", c);
}