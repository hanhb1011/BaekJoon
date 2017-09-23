import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int [] input = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
		int result = 0;
		
		while(!(input[2]-input[1] == 1 && input[1]-input[0] == 1)) {
			if(input[2]-input[1] > input[1]-input[0])
				input[0] = input[2]-1;
			else
				input[2] = input[0]+1;
			result++;
			Arrays.sort(input);
		}
		
		System.out.println(result);
		
	}
}


