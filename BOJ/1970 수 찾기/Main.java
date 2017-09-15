import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//input
		int N = scanner.nextInt();
		int[] a = new int [N];
		for(int i=0; i<N; i++)
			a[i] = scanner.nextInt();
		int M = scanner.nextInt();
		int []m = new int[M];
		for(int i=0; i<M; i++)
			m[i] = scanner.nextInt();
		
		StringBuilder result = new StringBuilder(100000);
		//quick sort
		Arrays.sort(a);
		//binary search
		for(int i=0; i<M; i++)
			result.append((Arrays.binarySearch(a, m[i]) >= 0 ? 1 : 0) + "\n");
		
		System.out.println(result);
		
	}
}
