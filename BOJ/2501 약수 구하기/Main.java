import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int n = 0;
		boolean found = false;
		for(int i=1; i<=N; i++) {
			if(N%i==0)
				n++;
			if(n==K) {
				n = i;
				found = true;
				break;
			}
		}
		System.out.println(found? n : 0);
	}
}

