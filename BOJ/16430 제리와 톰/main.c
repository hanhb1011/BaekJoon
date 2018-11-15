#include <stdio.h>

gcd(int a,int b){
	if (b==0)
		return a;
	return gcd(b, a%b);
}

main(a,b,c) {
	scanf("%d%d",&a,&b);
	c = gcd(a=b-a,b);
	printf("%d %d", a/c,b/c);
}