#include <stdio.h>

int wheel[4][8], dir[4];

main(){
	int i,j,k,n,d,res=0;
	char buf[10];
	for (i = 0; i < 4; i++) {
		scanf("%s", buf);
		for (j = 0; j < 8; j++) {
			wheel[i][j] = buf[j] - '0';
		}
	}
	scanf("%d", &k);
	while (k--) {
		int next_offset[8] = { 0, };
		scanf("%d%d", &n, &d);
		n--;
		d = -d;
		next_offset[n] = d;

		for (i = n + 1; i < 8; i++) {
			if (next_offset[i - 1] == 0) {
				break;
			}
			if (wheel[i][(dir[i] + 6) % 8] != wheel[i - 1][(dir[i - 1] + 2) % 8]) {
				next_offset[i] = -next_offset[i - 1];
			}
		}

		for (i = n - 1; i >= 0; i--) {
			if (next_offset[i + 1] == 0) {
				break;
			}
			if (wheel[i][(dir[i] + 2) % 8] != wheel[i + 1][(dir[i + 1] + 6) % 8]) {
				next_offset[i] = -next_offset[i + 1];
			}
		}

		for (i = 0; i < 8; i++) {
			dir[i] = (dir[i] + next_offset[i] + 8) % 8;
		}
	}

	for (i = 0; i < 4; i++) {
		if (wheel[i][dir[i]] == 1) {
			res += (1 << i);
		}
	}
	printf("%d", res);
}
