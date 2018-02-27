import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		StringBuffer sb=new StringBuffer();

		for(int i=0;i<T;i++) {
			int N=sc.nextInt(), max=N;
			while(N!=1) {
				N=N%2==0?N/2:(N*3+1);
				max=Math.max(N, max);
			}
			sb.append(max).append("\n");
		}
		System.out.println(sb);
	}
}