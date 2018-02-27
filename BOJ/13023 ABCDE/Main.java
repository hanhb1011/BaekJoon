import java.util.*;

public class Main{
	static ArrayList<Integer>[] r;
	static int[] visit = new int[2000];

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt();
		r=Arrays.stream(new List[N]).map(i->new ArrayList()).toArray(ArrayList[]::new);

		for(int i=0;i<M;i++) {
			int a=sc.nextInt(),b=sc.nextInt();
			r[a].add(b);
			r[b].add(a);
		}

		for(int i=0;i<N;i++)
			dfs(i,0);

		System.out.println(0);
	}

	static void dfs(int v, int c) {
		visit[v]=1;

		if(c==4) {
			System.out.println(1);
			System.exit(0);
		}
		for(int n: r[v])
			if(visit[n]==0)
				dfs(n,c+1);

		visit[v]=0;
	}
}