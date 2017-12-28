import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long []tree = new long[1<<21]; 
		int N = scanner.nextInt();
		int M = scanner.nextInt(); 
		int K = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=N; i++) {
			int num = scanner.nextInt();
			update(tree, i, num, 1, 1, N);
		}
		
		for(int i=0; i<M+K; i++) {
			int[] in= {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
			if(in[0]==1)
				update(tree,in[1],in[2],1,1,N);
			else
				sb.append(sum(tree, in[1]<in[2]?in[1]:in[2], in[1]>in[2]?in[1]:in[2] ,1,1,N) + "\n");
		}
		System.out.println(sb);
	}
	public static long update(long []tree, int loc, int val, int node, int a, int b) {
		//1. 업데이트에 포함되지 않는 노드일 경우
		if(loc<a || b<loc)
			return tree[node];
		//2. 마지막에 도달했을 경우
		if(a==b) {
			tree[node] = val;
			return tree[node];
		}
		//3. 업데이트에 포함되는 노드일 경우, child끼리 더함
		int mid = (a+b)/2;
		tree[node] = update(tree, loc, val, node*2, a, mid) + update(tree,loc,val,node*2+1, mid+1, b);
		return tree[node];
	}

	// [start, end] 의 합을 찾아준다.
	public static long sum(long[] tree, int start, int end, int node, int a, int b) {
		//1. 구간에 속할 경우 노드 값 리턴
		if(start<=a && b<=end)
			return tree[node];
		//2. 구간에서 벗어날 경우 0 리턴 
		if(a>end || b<start)
			return 0;
		//3. left child와 right right child를 더함.
		int mid = (a+b)/2;
		return sum(tree, start, end, node*2, a, mid) + sum(tree, start, end, node*2+1, mid+1, b);

	}
}

