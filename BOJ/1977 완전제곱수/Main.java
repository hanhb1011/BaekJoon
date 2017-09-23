import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int [] num = new int[10001];
		
		for(int i=1; i<=100; i++)
			num[i*i] = i*i;
		
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i=N; i<=M; i++)
			if(num[i]!=0) {
				if(min > num[i])
					min = num[i];
				sum+=num[i];
			}

		System.out.println(sum == 0 ? -1 : (sum + "\n" + min));
	}

}
