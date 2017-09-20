import java.util.Scanner;

public class Main {
	
	//에라토스테네스의 체 이용
	public static void getPrime(final int N, final int M) {
		int visited[] = new int[M+1];
		int sum = 0;
		int minInt = Integer.MAX_VALUE;
		for(int i=2; i<=M; i++) {
			
			if(i >= N && visited[i]==0) {
				sum+=i;
				minInt = i < minInt ? i : minInt;
			}
			for(int j=i; j*i<=M; j++) {
				if(visited[i*j] == 1)
					continue;
				visited[i*j] = 1;
			}
		} 
		
		System.out.println(sum != 0 ? sum : -1);
		System.out.println(minInt == Integer.MAX_VALUE ? "" : minInt);
	}
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		// M 이상 N 이상 소수의 최솟값과 합 구하기
		
		getPrime(N, M);
		
	}
}