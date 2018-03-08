import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int F=sc.nextInt(),S=sc.nextInt(),G=sc.nextInt(),U=sc.nextInt(),D=sc.nextInt(),d[]=new int[F];
		Arrays.fill(d, 10000000);
		d[S-1]=0;
		Queue<Integer>q=new LinkedList();
		q.add(S-1);
		while(!q.isEmpty()) {
			int now=q.poll();
			if(now+U<F && d[now]+1<d[now+U]) {
				d[now+U]=d[now]+1;
				q.add(now+U);
			}
			if(now-D>=0 && d[now]+1<d[now-D]) {
				d[now-D]=d[now]+1;
				q.add(now-D);
			}
		}
		System.out.println(d[G-1]==10000000?"use the stairs":d[G-1]);
	}
}