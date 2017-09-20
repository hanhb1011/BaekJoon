import java.util.Scanner;

public class Main {
	static int [] num;
	static int [] visited;
	static int N;
	static int maxSum = Integer.MIN_VALUE;
	//트랙백 방식 사용(모든 경우 거침)
	public static void recur(int v, int sum, int count) {
		visited[v] = 1;
		if(count == N) 
			maxSum = maxSum > sum ? maxSum : sum;
		for(int i=0; i<N; i++)
			if(visited[i]==0)
				recur(i, sum+Math.abs(num[v]-num[i]), count+1);

		visited[v] = 0;

	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		num = new int[N];
		visited = new int[N];
		for(int i=0; i<N; i++)
			num[i] = scanner.nextInt();

		for(int i=0; i<N; i++)
			recur(i, 0, 1);
		System.out.println(maxSum);


	}
}