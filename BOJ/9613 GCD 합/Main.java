import java.util.*;
public class Main{
	static long s;

	static int gcd(int a,int b) {
		return b==0?a:gcd(b,a%b);
	}

	static void rec(int i, int[]a) {
		if(i==a.length)
			return;
		for(int j=i+1;j<a.length;j++)
			s+=gcd(a[i],a[j]);
		rec(i+1,a);
	}

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0;t<T;t++) {
			s=0;
			rec(0,Arrays.stream(new int[sc.nextInt()]).map(i->sc.nextInt()).toArray());
			System.out.println(s);
		}
	}
}