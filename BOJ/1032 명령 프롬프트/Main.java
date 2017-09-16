import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] commands = new String[n];
		for(int i=0; i<n; i++)
			commands[i] = scanner.next();
		StringBuffer result = new StringBuffer(commands[0]);
		for(int i=1; i<n; i++) {
			for(int j=0; j<commands[i].length(); j++)
				if(result.charAt(j)!=commands[i].charAt(j))
					result.setCharAt(j, '?');
			
		}
		System.out.println(result);
		
	}
}