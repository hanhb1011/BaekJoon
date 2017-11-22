import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		int count = 0;
		boolean status = input.charAt(0) == '(' ? false : true; // ( T  ) F
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == ')') {
				count+= status ? 10 : 5;
				status = false;
			} else {
				count+= status ? 5 : 10;
				status = true;
			}
		}
		System.out.println(count);
	}
}

