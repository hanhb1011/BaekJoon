import java.util.*;

public class Main{
	static int B[]=new int[1000];
	static LinkedList<Integer>[] L;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt(), R=0;
		for(int i=0;i<M;i++)
			B[i]=-1;
		L=new LinkedList[N];
		for(int i=0;i<N;i++) {
			L[i]=new LinkedList<>();
			int k=sc.nextInt();
			for(int j=0;j<k;j++)
				L[i].add(sc.nextInt()-1);
		}
		for(int i=0;i<N;i++)
			if(dfs(i,new int[N]))
				R++;
		System.out.println(R);
	}

	static boolean dfs(int a,int[]v) {
		v[a]=1;
		for(int b:L[a])
			if(B[b]==-1 || v[B[b]]==0 && dfs(B[b],v)) {
				B[b]=a;
				return true;
			}
		return false;
	}
}