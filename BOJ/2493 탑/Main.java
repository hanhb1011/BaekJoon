import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt(), a[]=Arrays.stream(new int[N]).map(i->sc.nextInt()).toArray(), b[]=new int[N];
		StringBuffer sb= new StringBuffer("0 ");
		for(int i=1;i<N;i++)
			sb.append((b[i] = a[i-1]>a[i] ? i : find(b,a,b[i-1],a[i])) + " ");
		System.out.println(sb);
	}

	static int find(int[] b,int[] a,int i,int n){
		return i>=0 && a[i]>n ? i+1 : i<1 ? 0 : find(b,a,b[i]-1,n);
	}
}