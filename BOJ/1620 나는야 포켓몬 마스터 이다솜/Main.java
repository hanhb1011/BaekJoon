import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt();
		class P implements Comparable<P>{String s;int n;P(String ss, int nn){s=ss;n=nn;}
		public int compareTo(P o) {return s.compareTo(o.s);};}
		String []a=new String[N];
		P[] b=new P[N];
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<N;i++) {
			String s=sc.next();
			b[i]=new P(s,i+1);
			a[i]=s;			
		}
		Arrays.sort(b);
		for(int i=0;i<M;i++) {
			String s=sc.next();
			try {
				sb.append(a[Integer.valueOf(s)-1]).append("\n");
			} catch(Exception e) {
				sb.append(b[Arrays.binarySearch(b, new P(s,0))].n).append("\n");
			}
		}
		System.out.println(sb);
	}
}