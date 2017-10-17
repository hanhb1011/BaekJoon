import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int min[] = new int[100001];
	static int k;
	static void search(int n,  int count) {

		if(n==k) {
			min[n] = Math.min(min[n], count);
			return;
		}

		if(k < n){
			search(k, count+n-k);
		}else {

			if (n*2 <= 100000 && (count+1) < min[n*2]) {
				min[n*2] = count+1;
				search(n*2, count+1);
			}
			if( n+1 <= 100000 && (count+1) < min[n+1] ) {
				min[n+1] = count+1;
				search(n+1, count+1);
			}
			if( n-1 >=0 && count+1 < min[n-1]) {
				min[n-1] = count+1;
				search(n-1, count+1);
			}
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		k = scanner.nextInt();
		Arrays.fill(min, Integer.MAX_VALUE);
		min[n] = 0;
		if(k < n)
			System.out.println(n-k);
		else {
			search(n, 0);
			System.out.println(min[k]);
		}
	}
}
