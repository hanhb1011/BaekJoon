import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt()-1,A=sc.nextInt();
		while(N-->0) {
			int B=sc.nextInt(),G=gcd(A,B);
			System.out.println(A/G+"/"+B/G);
		}
	}
	
	static int gcd(int a,int b) {
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
}