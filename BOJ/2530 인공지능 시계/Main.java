import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		int S = scanner.nextInt();
		int input = scanner.nextInt();
		int secs = H*3600 + M*60 + S + input;
		
		System.out.println((secs/3600)%(24) + " " + (secs/60)%60 + " " + secs%60);
	}
}
