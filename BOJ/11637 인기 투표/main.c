#include <stdio.h>

int t, n, i,num, max, max_idx,is_dup, sum;

main() {
	scanf("%d", &t);
	
	while (t-- > 0) {
		scanf("%d", &n);
		max = max_idx = sum = i = is_dup = 0;

		while (n-- > 0) {
			i++;
			scanf("%d", &num);
			sum += num;
			if (num > max) {
				max = num;
				max_idx = i;
				is_dup = 0;
			}
			else if (num == max) {
				is_dup = 1;
			}

		}

		if (is_dup)
			printf("no winner\n");
		else if (max > sum/2)
			printf("majority winner %d\n", max_idx);
		else
			printf("minority winner %d\n", max_idx);

	}

}