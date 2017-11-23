import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int sum = scanner.nextInt();
		for(int i=0; i<8; i++)
			sum+=scanner.nextInt();
		
		System.out.println(N-sum);
	}
}

