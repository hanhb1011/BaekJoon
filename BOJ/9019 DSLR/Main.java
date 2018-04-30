import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
			int A=sc.nextInt(), B=sc.nextInt();
			Queue<Character> qq[]= new LinkedList[10000];
			Queue<Integer> q= new LinkedList<>();
			for(int i=0;i<10000;i++)
				qq[i]=new LinkedList<>();
			q.add(A);
			L:while(!q.isEmpty()){
				int n=q.poll();
				int[] next = {(2*n)%10000, (n+9999)%10000, ((n*10)+n/1000)%10000, ((n/10)+(n%10)*1000)%10000};
				char[] dslr = {'D','S','L','R'};
				for(int i=0;i<4;i++)
					if(qq[next[i]].size()==0 && next[i]!=A){
						for(char c:qq[n])
							qq[next[i]].add(c);
						qq[next[i]].add(dslr[i]);
						q.add(next[i]);
						if(next[i]==B)
							break L;
					}
			}
			for(char c:qq[B])
				System.out.print(c);
			System.out.println();
		}
	}
}