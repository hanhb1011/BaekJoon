#include <stdio.h>

int a[4],i,j,m,mi,t;
main(){
	for (i = 0; i < 4; i++)
		scanf("%d", &a[i]);
	for (i = 0; i < 3; i++) {
		mi = i;
		m = a[i];
		for(j=i+1;j<4;j++)
			if (m > a[j]) {
				mi = j;
				m = a[j];
			}
		t = a[i];
		a[i] = a[mi];
		a[mi] = t;
	}
	
	printf("%d", a[0] * a[2]);
}