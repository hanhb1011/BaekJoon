import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		StringBuffer sb= new StringBuffer().append("1");
		long n=gcd(sc.nextLong(),sc.nextLong());
		for(int i=0; i<n-1; i++)
			sb.append("1");
		System.out.println(sb);
	}
	static long gcd(long a, long b) {
		if(b==0)
			return a;
		return gcd(b, a%b);
	}
}