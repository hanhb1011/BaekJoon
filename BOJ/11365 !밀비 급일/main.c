#include <stdio.h>
#include <string.h>

int i, len;
char buf[555];

main() {

	fgets(buf, 555, stdin);

	while (strcmp(buf, "END\n") != 0) {
		len = strlen(buf);
		for (i = len - 2; i >= 0; i--)
			printf("%c", buf[i]);
		printf("\n");
		fgets(buf, 555, stdin);
	}

}