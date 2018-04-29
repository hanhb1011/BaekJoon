import java.util.*;

public class Main{
	static int[] vis=new int[32000];
	static List<Integer>[] l=new LinkedList[32000];
	static Stack<Integer> stk=new Stack<>();

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt();
		for(int i=0;i<N;i++)
			l[i]=new LinkedList<>();
		while(M-->0)
			l[sc.nextInt()-1].add(sc.nextInt()-1);
		for(int i=0;i<N;i++)
			if(vis[i]==0)
				dfs(i);
		while(!stk.isEmpty())
			System.out.print(stk.pop()+1+" ");
	}

	static void dfs(int u){
		vis[u]=1;
		for(int v:l[u])
			if(vis[v]==0)
				dfs(v);
		stk.push(u);
	}
}