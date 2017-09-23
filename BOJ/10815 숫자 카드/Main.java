import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int []A = new int[N];
		for(int i=0; i<N; i++)
			A[i] = scanner.nextInt();
		int M = scanner.nextInt();
		int []B = new int[M];
		for(int i=0; i<M; i++)
			B[i] = scanner.nextInt();
		Arrays.sort(A);
		StringBuilder result = new StringBuilder(1000000);
		for(int i=0; i<M; i++)
			if(Arrays.binarySearch(A, B[i])>=0)
				result.append("1 ");
			else
				result.append("0 ");
		System.out.println(result);
	}
}


