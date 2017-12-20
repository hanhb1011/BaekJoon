import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		boolean isP = true;

		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				isP = false;
				break;
			}
		}
		System.out.println(isP ? 1 : 0);
	}	
}

