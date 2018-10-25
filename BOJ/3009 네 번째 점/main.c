#include <stdio.h>

main(){
	int i=3,x[3],y[3];
	while (i-->0)
		scanf("%d%d",&x[i],&y[i]);
	printf("%d %d",x[0]==x[1]?x[2]:x[1]==x[2]?x[0]:x[1], y[0]==y[1]?y[2]:y[1]==y[2]?y[0]:y[1]);
}