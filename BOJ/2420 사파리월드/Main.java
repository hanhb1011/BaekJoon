import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long []in = {scanner.nextLong(), scanner.nextLong()};
		System.out.println(in[0]-in[1] < 0 ? in[1]-in[0] : in[0]-in[1]);
	}
}

