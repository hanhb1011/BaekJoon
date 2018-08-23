import java.util.*;

public class Main{
	static List<Integer>[] l = new LinkedList[1000];
	static Stack<Integer> stk = new Stack<>();
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt(), v[]=new int[N], seq[][]=new int[M][], ans[]=new int[N];
		for(int i=0;i<N;i++)
			l[i]=new LinkedList<>();
		for(int i=0;i<M;i++) {
			int W=sc.nextInt()-1, prev = sc.nextInt()-1;
			seq[i] = new int[W+1];
			seq[i][0] = prev;
			for(int j=0;j<W;j++) {
				int next=sc.nextInt()-1;
				l[prev].add(next);
				prev=next;
				seq[i][j+1]=next;
			}
		}
		for(int i=0;i<N;i++)
			if(v[i]==0)
				ts(i,v);
		
		for(int i=0;i<N;i++)
			ans[i]=stk.pop();
		
		boolean ok=true;
		for(int i=0;i<M;i++) {
			int idx = find(ans, seq[i][0],0);
			if(idx == -1)
				ok = false;
			for(int j=1;j<seq[i].length;j++) {
				idx = find(ans, seq[i][j], idx+1);
				if(idx == -1)
					ok = false;
			}
		}
		if(ok)
			for(int i:ans)
				System.out.println(i+1);
		else
			System.out.println(0);
	}

	static void ts(int a, int[] v) {
		v[a]=1;
		for(int b:l[a])
			if(v[b]==0)
				ts(b,v);
			
		stk.push(a);
	}

	static int find(int[] a, int v, int l) {
		for(int i=l;i<a.length;i++)
			if(v==a[i])
				return i;
		return -1;
	}
}