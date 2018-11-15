#include <stdio.h>
#include <string.h>

int n;
char buf[222], *ptr;

main() {
	scanf("%d\n", &n);
	while (n-- > 0) {
		fgets(buf, 222, stdin);
		ptr = strtok(buf, " ");
		ptr = strtok(NULL, " ");
		printf("god");
		while (ptr != NULL) {
			printf("%s", ptr);
			ptr = strtok(NULL, " ");
		}
	}
}