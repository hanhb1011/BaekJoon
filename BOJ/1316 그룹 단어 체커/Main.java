import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int []alpha;
		int result = 0;

		for(int i=0; i<N; i++){
			alpha = new int[26];
			String input = scanner.next();
			boolean isGroup = true;
			for(int j=0; j<input.length(); j++) {
				if(alpha[input.charAt(j)-97]==1) {
					isGroup = false;
					break;
				}
				if(j+1<input.length() && input.charAt(j+1) != input.charAt(j))
					alpha[input.charAt(j)-97]=1;
			}
			if(isGroup)
				result++;
		}
		
		System.out.println(result);
	}
}


