import java.util.*;
public class Main{
	static int min=Integer.MAX_VALUE, N;
	static int[][]m = new int[16][16];
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				m[i][j]=sc.nextInt();

		for(int i=0;i<N;i++)
			r(i,i,new int[N],0,0);

		System.out.println(min);
	}
	
	static void r(int s, int v, int[] vs, int c, int l){
		vs[v]=1;
		if(c==N && s==v) {
			min=Math.min(l, min);
			return;
		}
		for(int i=0;i<N;i++)
			if((vs[i]==0 && m[v][i]!=0) || (c==N-1 && i==s && m[v][i]!=0))
				r(s,i,vs,c+1,l+m[v][i]);
		vs[v]=0;
	}
}