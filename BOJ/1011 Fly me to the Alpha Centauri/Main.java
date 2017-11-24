import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		StringBuilder sb = new StringBuilder();

		for(int t=0; t<T; t++) {
			long X = scanner.nextLong();
			long Y = scanner.nextLong();
			long N = Y-X;
			long n=1, fn=1, cnt=1, i=1;

			/* 규칙 : X와 Y의 거리는 n*n 이상, (n+1)*(n+1)미만이다. */
			while(i*i <= N)
				i++;
			n = i-1;
			fn = n*n; 
			cnt = 2*n-1;

			while(fn != N) {
				for(i=n; i>=1; i--) {
					if(fn+i>N) 
						continue;
					else {
						fn+=i;
						n=i;
						break;
					}
				}
				cnt++;
			}
			sb.append(cnt+"\n");
		}
		System.out.println(sb);
	}
}

