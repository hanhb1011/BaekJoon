import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); //동전 종류
		int K = scanner.nextInt(); //총합
		int [] coin = new int[N];
		for(int i=0; i<N; i++)
			coin[i] = scanner.nextInt();
		
		//DP의 경우 O(N*K)이기 때문에 그리디 알고리즘으로 접근
		int count = 0;
		int val = K;
		int i=N-1;
		while(val !=0) {
			if(val/coin[i] == 0) {
				i--;
				continue;
			}
			if(i==0) { //시간 단축
				count+= val;
				break;
			}
			count += val/coin[i];
			val = val%coin[i];
			i--;
		}
		
		System.out.println(count);
	}


}


