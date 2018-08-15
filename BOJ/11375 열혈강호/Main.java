import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt(), B[]=new int[M], res=0;
		for(int i=0;i<M;i++)
			B[i]=-1;
		LinkedList<Integer>[] l=new LinkedList[N];

		for(int i=0;i<N;i++) {
			l[i] = new LinkedList<>();
			int K=sc.nextInt();
			while(K-->0)
				l[i].add(sc.nextInt()-1);
		}

		for(int i=0;i<N;i++)
			if(bm(i, new int[N],l,B))
				res++;
		System.out.println(res);
	}
	
	static boolean bm(int a, int v[], LinkedList<Integer> []l, int[] B) {
		v[a]=1;
		for(int b:l[a])
			if(B[b]==-1 || v[B[b]]==0 && bm(B[b],v,l,B)) {
				B[b]=a;
				return true;
			}
		return false;
	}
}