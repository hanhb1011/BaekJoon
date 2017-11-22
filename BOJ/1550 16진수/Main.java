import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String N = scanner.next();
		int sum = 0;
		for(int i=N.length()-1; i>=0; i--) {
			int c = N.charAt(i) >= 65 ? N.charAt(i)-55 : N.charAt(i)-48;
			sum += c*Math.pow(16, N.length()-1-i);
		}
		System.out.println(sum);
	}
}
