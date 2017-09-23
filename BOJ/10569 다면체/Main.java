import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		for(int t=0; t<T; t++) {
			int []input = {scanner.nextInt(), scanner.nextInt()};
			System.out.println(input[1]-input[0]+2);
			
		}
	}
}


