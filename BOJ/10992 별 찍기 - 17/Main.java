import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for(int i=0; i<N; i++) {
			for(int j=0; j<N-i-1; j++)
				System.out.print(" ");
			if(i==N-1)
				for(int j=0; j<=i; j++)
					if(j==i)
						System.out.println("*");
					else
						System.out.print("**");
			else
				for(int j=0; j<=i; j++)
					if(j==0 || j==i)
						System.out.print("* ");
					else
						System.out.print("  ");
			System.out.println();

		}
	}
}
