#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int t, i, n, a[500000], cnts[8001],max_ans,max,sum,cnt;
double avg;

int cmp(int *a, int *b) {
	return *a - *b;
}

main() {
	scanf("%d", &n);
	for (i = 0; i < n; i++) {
		scanf("%d", &a[i]);
		cnts[a[i]+4000]++;
		if (cnts[a[i] + 4000] > max)
			max = cnts[a[i] + 4000];
		sum += a[i];
	}


	avg = (double)sum / n;
	qsort(a, n, sizeof(int), cmp);
	for (i = -4000; i <= 4000; i++)
		if (cnts[i+4000] == max && cnt < 2) {
			max_ans = i;
			cnt++;
		}
	
	printf("%.0f\n%d\n%d\n%d", avg, a[n / 2], max_ans, a[n-1]-a[0]);

}