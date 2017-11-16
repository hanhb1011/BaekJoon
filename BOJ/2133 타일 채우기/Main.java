
import java.util.Scanner;

public class Main {
	
	/*
	 * AA****** ******** A*******
	 * BB****** A******* A*******
	 * CC****** A******* ********
	 * f(n) = f(n-2) + g(n) * 2 
	 * 
	 *  BB*****  B*****
	 *  CC*****  B*****
	 * AA****** AA*****
	 * g(n) = g(n-2) + f(n-2)
	 * 
	 */
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int []f = new int[31];
		int []g = new int[31];
		f[2] = 3;
		g[2] = 1;
		for(int i=3; i<=N; i++) {
			g[i] = f[i-2] + g[i-2];
			f[i] = i%2!=0 ? 0 : f[i-2] + 2*g[i];
		}
		
		System.out.println(f[N]);

	}
}
