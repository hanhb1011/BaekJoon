#include <stdio.h>
#include <stdlib.h>

int n, i, a[1000000], r;
int cmp(int *a,int *b){
	return *b-*a;
}

main(){
	scanf("%d", &n);
	for (i = 0; i < n; i++)
		scanf("%d", &a[i]);
	qsort(a, n, sizeof(int),cmp);
	for (i = 0; i < n; i++)
		r = r > a[i] + i + 2 ? r : a[i] + i + 2;
	printf("%d", r);
}