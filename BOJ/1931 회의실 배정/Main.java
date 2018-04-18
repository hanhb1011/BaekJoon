import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		class M{int a,b;M(int c,int d){a=c;b=d;}}
		int N=sc.nextInt(),r=0,t=0;
		M[] m=new M[N];
		for(int i=0;i<N;i++)
			m[i]=new M(sc.nextInt(),sc.nextInt());
		Arrays.sort(m,(a,b)->a.b!=b.b?a.b-b.b:a.a-b.a);
		for(M a:m)
			if(t<=a.a) {t=a.b; r++;}
		System.out.println(r);
	}
}