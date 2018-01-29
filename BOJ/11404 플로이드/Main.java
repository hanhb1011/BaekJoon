import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int[][] d = new int[N][N];
		for(int i=0;i<N;i++) {
			Arrays.fill(d[i], Integer.MAX_VALUE);
			d[i][i]=0;
		}
		for(int i=0;i<M;i++) {
			int a=sc.nextInt()-1, b=sc.nextInt()-1, c=sc.nextInt();
			d[a][b]=d[a][b] < c ? d[a][b] : c;
		}
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++)
				for(int k=0;k<N;k++)
					if(d[j][i]!=Integer.MAX_VALUE && d[i][k]!=Integer.MAX_VALUE&& d[j][k] > d[j][i]+d[i][k])
						d[j][k] = d[j][i]+d[i][k];
			
		for(int i=0;i<N;i++) {
			for(int j=0; j<N;j++)
				System.out.print((d[i][j]==Integer.MAX_VALUE?0:d[i][j])+ " ");
			System.out.println();
		}
	}
}