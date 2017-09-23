import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		// A 65
		int count = 0;
		for(int i=0; i<input.length(); i++) {
			int token = input.charAt(i) - 65;
			if(token < 3) {
				count+=3;
			} else if(token <6) {
				count+=4;
			} else if(token <9) {
				count+=5;
			} else if(token <12) {
				count+=6;
			} else if(token <15) {
				count+=7;
			} else if(token <19) {
				count+=8;
			} else if(token <22) {
				count+=9;
			} else {
				count+=10;
			}
		}
		System.out.println(count);
	}
}


