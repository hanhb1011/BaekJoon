import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt(),res=10000000,a=1000,b=1000;
		while(M-->0){
			a=Math.min(a,sc.nextInt());
			b=Math.min(b,sc.nextInt());
			res = Collections.min(Arrays.asList(res,(int)Math.ceil((double)N/6)*a,b*N,N/6*a+N%6*b));
		}
		System.out.println(res);
	}
}