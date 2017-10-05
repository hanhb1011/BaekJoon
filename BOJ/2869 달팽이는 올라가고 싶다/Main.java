import java.util.Scanner;

public class Main {

	public static void main(String [] args) {

		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int V = scanner.nextInt();
		int count = (V-A)/(A-B);
		int dist = count*(A-B);
		while(dist < V) {
			count++;
			dist+=A;
			if(dist >= V)
				break;
			dist-=B;
		}
		System.out.println(count);
	}
}