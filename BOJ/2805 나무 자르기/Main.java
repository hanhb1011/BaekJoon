
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String [] args) {

		//input and initialize
		Scanner scanner = new Scanner(System.in);
		long N = scanner.nextInt();
		long M = scanner.nextInt();
		Long []tr = new Long[(int)N];
		for(int i=0; i<N; i++)
			tr[i] = scanner.nextLong();

		/* 
		 * 2805 나무 자르기 : DP이용
		 */
		
		Arrays.sort(tr, Collections.reverseOrder());
		long less = tr[0] > M ? 0 : M - tr[0] ; //모자란 나무의 수, 초기값  : 0번 나무가 M보다 크면 0, 작거나 같으면 0번 나무의 길이 - M
		long over = 0; //초과된 나무의 수 
		long dp = less > 0 ? 0 : tr[0] - M; //dp : 나무의 최대길이 저장
		
		for(int i=1; i<N; i++) {
			if(tr[i] <= dp)
				break;

			if(less == 0) {
				long surplus = (tr[i]-dp+over);
				if(surplus >= (i+1)) {
					dp += surplus >= i+1 ? (surplus)/(i+1) : 0;
					over = surplus % (i+1);
				} else {
					over += tr[i]-dp;
				}
			} else {
				if(tr[i] > less) {
					dp = (tr[i]-less) / (i+1);
					over = (tr[i]-less) % (i+1);
					less = 0;
				} else {
					less -= tr[i];
				}
			}
		}
		System.out.println(dp);

	}
}