import java.util.Scanner;

public class Main {

	public static void main(String [] args) {

		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int result = 0;
		for(int i=0; i<3; i++) {
			int num =(A*((B/(int)Math.pow(10, i))%10));
			System.out.println(num);
			result+=(int)num*Math.pow(10, i);
		}
		System.out.println(result);
	}
}