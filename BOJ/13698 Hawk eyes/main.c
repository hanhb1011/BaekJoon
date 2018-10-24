#include <stdio.h>

char s[201], c;
int i = 0, a[4] = { 1,0,0,2 }, b[6][2] = { {0,1},{0,2},{0,3},{1,2},{1,3},{2,3} },q,w;

swap(int i,int j) {
	int t = a[i];
	a[i] = a[j];
	a[j] = t;
}

main() {
	scanf("%s", s);
	while ((c = s[i++]) != '\0')
		swap(b[c - 'A'][0], b[c - 'A'][1]);
	for (i = 0; i < 4; i++)
		if (a[i] == 1)
			q = i + 1;
		else if (a[i] == 2)
			w = i + 1;
	printf("%d\n%d", q, w);
}