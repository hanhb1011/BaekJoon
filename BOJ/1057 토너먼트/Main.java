import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int input[] = {scanner.nextInt(), scanner.nextInt()};
		Arrays.sort(input);

		int round = 1;
		while(!(input[0]%2 ==1 && input[0] +1 == input[1])) {
			input[0] = Math.round(input[0]/2.0f);
			input[1] = Math.round(input[1]/2.0f);
			N = Math.round(N/2.0f);
			round++;
		}
		System.out.println(round);

	}
}


