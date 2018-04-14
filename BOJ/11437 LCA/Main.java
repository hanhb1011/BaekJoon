import java.util.*;

public class Main{
	static int[] par=new int[50001], vis=new int[50001];
	static List<Integer>[] l=new LinkedList[50001];
	static StringBuffer sb= new StringBuffer();

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		for(int i=1;i<=N;i++) {
			par[i]=i;
			l[i]=new LinkedList<>();
		}
		for(int i=0;i<N-1;i++) {
			int a=sc.nextInt(),b=sc.nextInt();
			l[a].add(b); l[b].add(a);
		}

		dfs(1);

		int M=sc.nextInt();
		while(M-->0)
			find(sc.nextInt(),sc.nextInt(), new int[N+1]);
		System.out.println(sb);
	}

	static void dfs(int v) {
		vis[v]=1;
		for(int u:l[v])
			if(vis[u]==0) {
				par[u]=v;
				dfs(u);
			}
	}

	static void find(int a,int b, int[] vs) {
		vs[a]=vs[b]=1;

		if(a == b)
			sb.append(a+"\n");
		else if(vs[par[a]]==1 && a!=1 || par[a]==par[b])
			sb.append(par[a]+"\n");
		else if(vs[par[b]]==1 && b!=1)
			sb.append(par[b]+"\n");
		else
			find(par[a],par[b], vs);
	}
}