import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int []num = new int[N];
		int count = 0;
		for(int i=0; i<N; i++) {
			num[i] = scanner.nextInt();
			int sum = 0;
			for(int j=i; j>=0; j--) {
				sum+=num[j];
				if(sum == M)
					count++;
				if(sum>=M)
					break;
			}
		}
		System.out.println(count);
		
	}
}

