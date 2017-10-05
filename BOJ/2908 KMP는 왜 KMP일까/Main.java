import java.util.Scanner;

public class Main {

	public static void main(String [] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		StringBuilder result = new StringBuilder(3);
		result.append(input.charAt(0));
		for(int i=1; i<input.length(); i++) {
			if(input.charAt(i) == '-') {
				result.append(input.charAt(i+1));
				i++;
			}
		}
		System.out.println(result);
	}
}