#include <stdio.h>

int a[3] = { 1,0,0 },i;
char s[99],c;

swap(i, j) {
	int t = a[i];
	a[i] = a[j];
	a[j] = t;
}

main() {
	scanf("%s", s);
	while ((c = s[i++])!='\0') {
		if (c == 'A') swap(0, 1);
		else if (c == 'B') swap(1, 2);
		else swap(0, 2);
	}
	for (i = 0; i < 3; i++)
		if (a[i] == 1)
			printf("%d", i + 1);
}