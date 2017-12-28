import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int [] sum = new int[N+1];
		for(int i=1; i<=N; i++)
			sum[i]+=sum[i-1]+scanner.nextInt();
		for(int i=0; i<M; i++) {
			int []sect = {scanner.nextInt(), scanner.nextInt()};
			sb.append(sum[sect[1]]-sum[sect[0]-1] +"\n");
		}
		System.out.println(sb);
	}
}

