import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	static int[] par = new int[1000001];
	static int find(int n) {
		if(n==par[n])
			return n;
		return par[n] = find(par[n]);
	}
	
	static void merge(int a, int b) {
		a = find(a);
		b = find(b);
		par[a] = b;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt(), M = sc.nextInt();
		
		IntStream.range(0, par.length).forEach(i->{par[i]=i;});
		
		for(int i=0; i<M; i++) {
			if(sc.nextInt()==0) {
				merge(sc.nextInt(), sc.nextInt());
			} else {
				if(find(sc.nextInt()) == find(sc.nextInt()))
					sb.append("YES\n");
				else
					sb.append("NO\n");
			}
		}
		System.out.println(sb);
	}
}