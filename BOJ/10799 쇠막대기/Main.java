import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		
		boolean isBar = false;
		int sum = 0;
		int count = 0;
		for(int i=0; i<input.length(); i++) {
			
			if(input.charAt(i) == '(') {
				count ++;
				isBar = true;
			} else {
				count --;
				if(isBar) {
					sum+= count;
					isBar = false;
				} else {
					sum++;
				}
			}
		}
			
		
		System.out.println(sum);
	}
}
