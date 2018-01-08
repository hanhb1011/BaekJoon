import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long []in = {sc.nextLong(), sc.nextLong()};
		Arrays.sort(in);
		
		long A = (in[0]-1)*in[0]/2;
		long B = (in[1]+1)*(in[1])/2;
		System.out.println(B-A);
	}
}