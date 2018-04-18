import java.math.*;
import java.util.*;

public class Main{
	static StringBuffer sb=new StringBuffer();
	static int N=new Scanner(System.in).nextInt();
	public static void main(String[] args){
		BigInteger r = new BigInteger("2").pow(N).subtract(BigInteger.ONE);
		System.out.println(r.toString());
		if(N<=20) {
			go(N,1,2,3);
			System.out.println(sb);
		}
	}

	static void go(int n, int a, int b, int c) {
		if(n==1) {
			if(N<=20)
				sb.append(a).append(" ").append(c).append("\n");
			return;
		}
		go(n-1,a,c,b);
		if(N<=20)
			sb.append(a).append(" ").append(c).append("\n");
		go(n-1,b,a,c);
	}
}