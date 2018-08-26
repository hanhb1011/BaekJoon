import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Integer[] a=Arrays.stream(sc.next().split(":")).map(i->Integer.valueOf(i)).toArray(Integer[]::new);
		int c = gcd(a[0],a[1]);
		System.out.println(a[0]/c+":"+a[1]/c);
	}
	static int gcd(int a,int b) {
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
}