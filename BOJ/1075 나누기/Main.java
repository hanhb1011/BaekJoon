import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int N = (scanner.nextInt())/100*100;
		int F = scanner.nextInt();
		
		int i=0;
		for(i=0; i<100; i++) {
			if((N+i) % F == 0)
				break;
		}
		System.out.println((i/10 == 0 ? "0" : String.valueOf(i/10)) + (i%10 == 0 ? "0" : String.valueOf(i%10)));
		
	}
}


