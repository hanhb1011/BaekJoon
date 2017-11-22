import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for(int t=0; t<T; t++) {
			int N = scanner.nextInt();
			int sum=0;
			for(int n=0; n<N; n++)
				sum+=scanner.nextInt();
			System.out.println(sum);
		}
	}
}
