import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		
		//A / B + C / D = (AD + BC)/BD
		int E = A*D + B*C;
		int F = B*D;
		int Div = gcd(E, F);
		System.out.println((E/Div) + " " + (F/Div));
		
	}
	
	public static int gcd(int a, int b) {
		if(a==0)
			return b;
		return gcd(b%a, a);
	}
	
}
