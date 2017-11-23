import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum=0, min=Integer.MAX_VALUE;
		for(int i=0; i<7; i++) {
			int n = scanner.nextInt();
			if(n%2==1) {
				sum+=n;
				min = min < n ? min : n;
			}
		}
		System.out.println(sum == 0 ? -1 : (sum+"\n"+min));
	}
}

