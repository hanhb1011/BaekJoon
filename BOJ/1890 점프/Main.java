import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int [][]b=new int[N][N];
		long [][]d=new long[N][N];
		d[0][0]=1;
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				b[i][j]=sc.nextInt();
		b[N-1][N-1]=1;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(i+b[i][j]<N)
					d[i+b[i][j]][j]+=d[i][j];
				if(j+b[i][j]<N)
					d[i][j+b[i][j]]+=d[i][j];
			}
		}
		System.out.println(d[N-1][N-1]);
	}
}