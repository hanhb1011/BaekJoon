import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		double min = (double)scanner.nextInt()/scanner.nextInt();
		int N = scanner.nextInt();
		for(int i=0; i<N; i++) {
			double input = (double)scanner.nextInt()/scanner.nextInt();
			min = min < input ? min : input;
		}
		System.out.printf("%.2f", min*1000);
	}
}
