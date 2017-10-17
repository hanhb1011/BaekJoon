import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int [] inputs = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
		Arrays.sort(inputs);
		String str = scanner.next();
		for(int i=0; i<3; i++)
			System.out.print((str.charAt(i) == 'A' ? inputs[0] : str.charAt(i) == 'B' ? inputs[1] : inputs[2]) + " ");
		
		
		
	}
}
