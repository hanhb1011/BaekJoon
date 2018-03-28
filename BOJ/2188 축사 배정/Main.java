import java.util.*;

public class Main{
	static int[]a=new int[1001], b=new int[1001], vis=new int[1001];
	static List<Integer>[] l;

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt(), res=0;
		l = Arrays.stream(new LinkedList[N+1]).map(i->new LinkedList<>()).toArray(LinkedList[]::new);
		for(int i=1;i<=M;i++) {
			int k=sc.nextInt();
			while(k-->0)
				l[i].add(sc.nextInt());
		}

		for(int i=1;i<=N;i++)
			if(dfs(i, new int[N+1]))
				res++;
		System.out.println(res);
	}
	
	static boolean dfs(int v, int[]vis) {
		vis[v]=1;
		for(int u:l[v]) {
			if(b[u]==0 || vis[b[u]]==0 && dfs(b[u],vis)) {
				a[v]=u;
				b[u]=v;
				return true;
			}
		}
		return false;
	}
}