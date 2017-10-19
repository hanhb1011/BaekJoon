import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		for(int i=0; i<N; i++) {
			if(i%2==0)
				for(int j=0; j<N; j++)
					System.out.print("* ");
			else
				for(int j=0; j<N; j++)
					System.out.print(" *");
			System.out.println();
		}
	}
}
