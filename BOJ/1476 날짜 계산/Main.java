import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int []input = {scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};
		int []result = {1, 1, 1};
		
		int year = 1;
		
		while(!(result[0] == input[0] && result[1] == input[1] && result[2] == input[2])) {
			result[0] = result[0]+1 > 15 ? 1 : result[0]+1;
			result[1] = result[1]+1 > 28 ? 1 : result[1]+1;
			result[2] = result[2]+1 > 19 ? 1 : result[2]+1;
			year++;
		}
	
		System.out.println(year);
	
	}

}
