import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		int N = new Scanner(System.in).nextInt();
		int res = 1000000;
		for(int i=1; i<=N; i++) {
			int num = i;
			for(int j=0; j<=6; j++)
				num+=(i/Math.pow(10, j))%10;
			res = num == N ? (res < i ? res : i) : res;
		}
		System.out.println(res == 1000000 ? 0 : res);
	}
}