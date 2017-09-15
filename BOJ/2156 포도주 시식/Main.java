import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int []wine = new int[n];
		int [][]max = new int[n][2]; // 0 가능, 1 불가
		for(int i=0; i<n; i++)
			wine[i] = scanner.nextInt();
		if(n==1)
			System.out.println(wine[0]);
		else {
			max[0][0] = wine[0];
			max[1][0] = wine[1];
			
			for(int i=1; i<n; i++) {
				//2579 계단 오르기와 다른 점 : 세 칸 이상 건너뛸 수 있기 때문에 +2 의 경우도 추가해준다.
				max[i][1] = max[i-1][0] + wine[i];
				if(i+1<n)
					max[i+1][0] = Math.max(max[i+1][0] ,Math.max(max[i-1][0], max[i-1][1]) + wine[i+1]);
				if(i+2<n)
					max[i+2][0] = Math.max(max[i+2][0], Math.max(max[i-1][0], max[i-1][1]) + wine[i+2]);

			} 
			System.out.println(Math.max(Math.max(max[n-2][0], max[n-2][1]), Math.max(max[n-1][0], max[n-1][1])));
		}
		
	}
}
