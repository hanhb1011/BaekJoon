#include <stdio.h>

int main() {
	int t;
	scanf("%d", &t);
	while (t-->0) {
		int i,j,a[10];
		for(i=0;i<10;i++){
			scanf("%d", &a[i]);
		}
		for (i = 0; i < 3; i++) {
			int m=0,k=i;
			for(j=i;j<10;j++)
				if (m < a[j]) {
					k = j;
					m = a[j];
				}
			int t = a[i];
			a[i] = a[k];
			a[k] = t;
		}
		printf("%d\n",a[2]);
	}
}


