import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int []A = new int[N];
		int []B = new int[N];
		int count = 0;
		for(int i=0; i<N; i++) {
			A[i] = scanner.nextInt();
			B[i] = scanner.nextInt();
			count+= B[i] - (B[i]/A[i])*A[i];
		}
		System.out.println(count);
	}
}
