import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		for(int i=1; i<2*n; i++) {
			if(i<=n) {
				for(int j=0; j<i; j++)
					System.out.print("*");
				for(int j=0; j<2*n-2*i; j++)
					System.out.print(" ");
					for(int j = 0; j<i; j++)
						System.out.print("*");
			}
			else {
				for(int j=0; j<2*n-i; j++)
					System.out.print("*");
				for(int j=0; j<2*i-2*n; j++)
					System.out.print(" ");
				for(int j=0; j<2*n-i; j++)
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
