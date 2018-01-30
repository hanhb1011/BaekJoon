import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		StringBuffer sb=new StringBuffer();
		PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->{return b-a;});
		for(int i=0;i<N;i++) {
			int n=sc.nextInt();
			if(n==0)
				sb.append((q.peek()==null?0:q.poll())+"\n");
			else
				q.add(n);
		}
		System.out.println(sb);
	}
}