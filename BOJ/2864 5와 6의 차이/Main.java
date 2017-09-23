import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int min = 0, max = 0;
		
		for(int i=6; i>=0; i--) {
			int numA = (int) (A/Math.pow(10, i)%10);
			int numB = (int) (B/Math.pow(10, i)%10);
			min += numA == 0 ? 0 : numA == 6 ? 5*Math.pow(10, i) : numA*Math.pow(10, i);
			max += numA == 0 ? 0 : numA == 5 ? 6*Math.pow(10, i) : numA*Math.pow(10, i);
			min += numB == 0 ? 0 : numB == 6 ? 5*Math.pow(10, i) : numB*Math.pow(10, i);
			max += numB == 0 ? 0 : numB == 5 ? 6*Math.pow(10, i) : numB*Math.pow(10, i);
		}
		
		System.out.println(min + " " + max);
	}
}


