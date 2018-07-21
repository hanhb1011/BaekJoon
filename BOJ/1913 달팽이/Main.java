import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt(),y=N/2,x=N/2,c=1,l=0,di=0,a[][]=new int[N][N],d[][]={{0,-1},{-1,0},{0,1},{1,0}},ry=0,rx=0;

		while(c<=N*N) {
			for(int i=0;i<l;i++) {
				if(c==M) {
					ry=y;
					rx=x;
				}
				if(y>=0 && x>=0 && y<N && x<N)
					a[y][x]=c++;
				y+=d[di][0];
				x+=d[di][1];
			}
			di=(di+1)%4;
			if(di%2==1)
				l++;
		}
		
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<N*N;i++) {
			sb.append(a[i/N][i%N]).append(" ");
			if(i%N==N-1 && i/N!=N-1)
				sb.append("\n");
		}
		System.out.println(sb);
		System.out.println((ry+1)+" "+(rx+1));
	}
}