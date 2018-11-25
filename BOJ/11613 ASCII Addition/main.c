#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdint.h>

int i, j, l, n,k=1;
uint64_t t,v;
char a[7][80] = {
"xxxxx.....x.xxxxx.xxxxx.x...x.xxxxx.xxxxx.xxxxx.xxxxx.xxxxx.......",
"x...x.....x.....x.....x.x...x.x.....x.........x.x...x.x...x...x...",
"x...x.....x.....x.....x.x...x.x.....x.........x.x...x.x...x...x...",
"x...x.....x.xxxxx.xxxxx.xxxxx.xxxxx.xxxxx.....x.xxxxx.xxxxx.xxxxx.",
"x...x.....x.x.........x.....x.....x.x...x.....x.x...x.....x...x...",
"x...x.....x.x.........x.....x.....x.x...x.....x.x...x.....x...x...",
"xxxxx.....x.xxxxx.xxxxx.....x.xxxxx.xxxxx.....x.xxxxx.xxxxx......."
}, b[7][999], c[7][999];

find(int n) {
	int k, i, j;

	for (k = 0; k <= 66; k+=6) {
		int found = 1;
		for (i = 0; i < 7; i++) {
			for (j = 0; j < 5; j++) {
				if (a[i][k+j] != b[i][n+j]) {
					found = 0;
				}
			}
		}
		if (found)
			return k / 6;
	}
	return -1;
}

drawnum(int n,int k) {
	int i, j;
	for (i = 0; i < 7; i++) {
		for (j = 0; j < 6; j++) {
			c[i][j + k * 6] = a[i][j + n * 6];
		}
	}

}

main() {
	for (i = 0; i < 7; i++)
		scanf("%s", b[i]);
	l = strlen(b);
	for (j = 0; j < l; j += 6) {
		n = find(j);
		if (n == 10) {
			v = t/10;
			t = 0;
		}
		else
			t += n;
		t *= 10;
	}
	v += t/10;

	while (v / (int)pow(10,k++) > 0);
	for (i = 0; i < k-1; i++) {
		drawnum(v / (int)pow(10, k - i-2), i);
		v %= (int)pow(10, k-i-2);
	}

	for (i = 0; i < 7; i++) {
		l = strlen(c[i]);
		c[i][l - 1] = '\0';
		printf("%s\n", c[i]);
	}

}