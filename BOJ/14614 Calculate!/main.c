#include <stdio.h>
#include <string.h>

char s[222];
main(a,b) {
	scanf("%d%d%s",&a,&b,s);
	printf("%d",(s[strlen(s)-1]-'0')%2==1? a^b:a);
}