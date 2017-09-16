import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int [] rope = new int[N];
		for(int i=0; i<N; i++)
			rope[i] = scanner.nextInt();
		int max = 0;
		Arrays.sort(rope);
		
		for(int i=N-1; i>=0; i--)
			max = max > rope[i]*(N-i) ? max : rope[i]*(N-i);
			
		System.out.println(max);
	}
}