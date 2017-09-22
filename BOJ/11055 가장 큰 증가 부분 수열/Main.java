import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int [] num = new int[N];
		for(int i=0; i<N; i++)
			num[i] = scanner.nextInt();
		
		int []dp = new int[1001]; // 해당 수의 최대 합 저장
		int result = 0; //최종 합
		
		for(int i=0; i<N; i++) {
			int max = 0;
			for(int j=num[i]-1; j>=1; j--) {
				if(max < dp[j])
					max = dp[j];
			}
			dp[num[i]] = max+num[i];
			result = result > dp[num[i]] ? result : dp[num[i]];
		}
		System.out.println(result);
	}
	
}
