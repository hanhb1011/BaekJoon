import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int M=sc.nextInt(),N=sc.nextInt();
		int[][] m =new int[M][N];
		int[][][] d =new int[M][N][2];
		for(int i=0;i<M;i++)
			for(int j=0;j<N;j++) {
				m[i][j]=sc.nextInt();
				d[i][j][0]=d[i][j][1]=Integer.MIN_VALUE;
			}
		d[0][0][0]=d[0][0][1]=m[0][0];
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++)
				if(j+1<N)
					d[i][j+1][0]=Math.max(d[i][j+1][0], d[i][j][0]+m[i][j+1]);
			for(int j=N-1;j>=0;j--) {
				if(j-1>=0 && i!=0)
					d[i][j-1][1]=Math.max(d[i][j-1][1], d[i][j][1]+m[i][j-1]);
				if(i+1<M) 
					d[i+1][j][0]=d[i+1][j][1]=Math.max(d[i][j][1], d[i][j][0])+m[i+1][j];
			}
		}
		System.out.println(Math.max(d[M-1][N-1][0], d[M-1][N-1][1]));
	}
}