import java.math.BigInteger;
import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		for(int t=0; t<T; t++) {
			int N = scanner.nextInt();
			BigInteger sum = new BigInteger("0");
			for(int i=0; i<N; i++)
				sum = sum.add(new BigInteger(scanner.next()));
			sum = sum.mod(new BigInteger(String.valueOf(N)));
			System.out.println(sum.intValue()== 0 ? "YES" : "NO");
		}
	}
}