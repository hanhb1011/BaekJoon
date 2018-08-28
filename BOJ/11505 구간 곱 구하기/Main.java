import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt(), K=sc.nextInt(), a[]=new int[1<<21], init[]=new int[1<<21];
		
		for(int i=1;i<=N;i++)
			update(a,1,i,sc.nextInt(),1,N,init);
		
		for(int i=0;i<M+K; i++) {
			int c = sc.nextInt();
			if(c==1)
				update(a,1,sc.nextInt(),sc.nextInt(),1,N,init);
			else 
				System.out.println(find(a,1,1,N,sc.nextInt(),sc.nextInt()));
		}
		
	}
	
	static long update(int[] a, int i, int n, int v, int l, int r, int[] init) {
		if(n==l && n==r) {
			init[i] = 1;
			return a[i] = v;
		}
		if(n<l || r<n)
			return init[i] == 0? 1:a[i];
		
		int m = (l+r)/2;
		init[i] = 1;
		return a[i] = (int)((update(a,i*2,n,v,l,m,init) * update(a,i*2+1,n,v,m+1,r,init))%1000000007);
	}


	static long find(int[] a,int i, int l, int r, int L,int R) {
		if(L<=l && r<=R)
			return a[i];
		if(R<l || r<L)
			return 1;

		int m = (l+r)/2;
		return ((find(a,i*2,l,m,L,R) * find(a,i*2+1,m+1,r,L,R)%1000000007));
	}
}