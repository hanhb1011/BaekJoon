import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int []num = new int[N];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<N; i++)
			num[i] = scanner.nextInt();
		
		for(int i=0; i<N; i++) {
			if(num[i] > max)
				max = num[i];
			if(num[i] < min)
				min = num[i];
		}
		System.out.println(min + " " + max);
	}
}


