import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt(), a[]=new int[1<<19];
		Arrays.fill(a, Integer.MAX_VALUE);
		for(int i=1;i<=N;i++)
			makeTree(a,1,sc.nextInt(),1,N,i);

		for(int i=0;i<M;i++)
			System.out.println(find(a,1,1,N,sc.nextInt(),sc.nextInt()));
	}
	
	static int makeTree(int[] a, int i, int v, int l,int r, int k) {
		if(k<l || r<k)
			return a[i];
		if(l==r)
			return a[i]=v;
		int m = (l+r)/2;
		return a[i] = Math.min(makeTree(a,i*2,v,l,m,k), makeTree(a,i*2+1,v,m+1,r,k));
	}
	
	static int find(int []a, int i, int l, int r, int L,int R) {
		if(R<l || r<L)
			return Integer.MAX_VALUE;
		if(L<=l && r<=R)
			return a[i];
		int m = (l+r)/2;
		return Math.min(find(a,i*2,l,m,L,R), find(a,i*2+1,m+1,r,L,R));
	}
	
}