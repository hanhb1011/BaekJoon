import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		//입력, 초기화
		int T = scanner.nextInt();
		long [][]dp = new long[100][2]; //0번째에 결과값 저장, 1번째에 외부와 맞닿았는지 여부 저장
		dp[0][0] = 1; dp[1][0] = 1;
		dp[2][0] = 1; dp[3][0] = 2;
		dp[4][0] = 2;

		//dp
		for(int i=5; i<100; i++) {
			int min = Integer.MAX_VALUE, minIdx=0;
			for(int j=0; j<i; j++)
				if(dp[j][1]==0) {
					dp[j][1]=1;
					minIdx = j;
					break;
				}
			dp[i][0] = dp[i-1][0] + dp[minIdx][0];
		}

		//출력
		for(int t=0; t<T; t++)
			System.out.println(dp[scanner.nextInt()-1][0]);
	}
}


