import java.util.Scanner;

public class Main {
	static StringBuilder result = new StringBuilder();
	static int count = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		hanoi(N,1,2,3);
		System.out.println(count+ "\n" + result);
	}

	static void hanoi(int N, int a, int b, int c) {
		count++;
		if(N==1) {
			result.append(a+" "+c+"\n");
			return;
		}
		hanoi(N-1,a,c,b);
		result.append(a +" " +c+"\n");
		hanoi(N-1,b,a,c);
	}
}


