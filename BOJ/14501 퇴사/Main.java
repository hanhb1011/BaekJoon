import java.util.Scanner;

public class Main {
	
	static int N;
	static int []T, P;
	static int max = 0;
	
	public static void recur(int cur, int[] visited, int cost) {
		max = cost > max ? cost : max;
		
		for(int i=cur; i<N; i++)
			if(i + T[i] <= N )
				recur(i+T[i], visited, cost+ P[i]);
	}
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		N = scanner.nextInt();
		T = new int[N];
		P = new int[N];
		
		for(int i=0; i<N; i++) {
			T[i] = scanner.nextInt();
			P[i] = scanner.nextInt();
		}
		
		recur(0, new int[N], 0);
		System.out.println(max);
	}
}
