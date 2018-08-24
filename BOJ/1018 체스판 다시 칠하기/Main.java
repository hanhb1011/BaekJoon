import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), M=sc.nextInt(), ans=Integer.MAX_VALUE;
		char[][] a=new char[N][];
		for(int i=0;i<N;i++)
			a[i] = sc.next().toCharArray();
		for(int i=0;i<N-7;i++)
			for(int j=0;j<M-7;j++) 
				for(int k=0;k<2;k++) {
					boolean b = k==0?true:false;
					int c=0;
					for(int y=i;y<i+8;y++) {
						c+=cnt(b,a,y,j);
						b=!b;
					}
					ans=Math.min(ans, c);
				}
		System.out.println(ans);
	}
	static int cnt(boolean b, char[][] a, int y, int x) {
		int c=0;
		for(int i=x;i<x+8;i++) {
			c+= b && a[y][i]=='W' || !b && a[y][i]=='B'? 1 : 0;
			b=!b;
		}
		return c;
	}
}