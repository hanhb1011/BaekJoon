import java.util.Scanner;

public class Main {
	static int N;
	static int S;
	static int[] num;
	static int count = 0;
	
	public static void recur(int index, int sum) {
		if(sum==S)
			count++;
		for(int i = index+1; i<N; i++)
			recur(i, sum+num[i]);
	}

	public static void main(String [] args) {

		Scanner scanner = new Scanner(System.in);
		N = scanner.nextInt();
		S = scanner.nextInt();
		num = new int[N];
		for(int i=0; i<N; i++)
			num[i] = scanner.nextInt();
		
		for(int i=0; i<N; i++)
			recur(i, num[i]);
		
		System.out.println(count);
	}
}