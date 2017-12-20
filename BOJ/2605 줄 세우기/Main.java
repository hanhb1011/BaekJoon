import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int []line = new int[N];
		
		for(int i=0; i<N; i++) {
			int n = scanner.nextInt();
			for(int j=i; j>i-n; j--)
				line[j] = line[j-1];
			line[i-n] = i;
		}
		
		for(int i=0; i<N; i++)
			System.out.print((line[i]+1) + " ");	
	}
}

