import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			int N=sc.nextInt();
			int s=0; double a=0;
			while(N-->0) {
				int b=sc.nextInt(); double c=sc.nextDouble();
				s+=b; a+=b*c;
			}
			System.out.println(s +" "+String.format("%.1f", a/s));
		}
	}
}