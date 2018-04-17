import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt(), va[][]=new int[N][N], vb[][]=new int[N][N], ra=0,rb=0; char[][] c = new char[N][N];
		for(int i=0;i<N;i++)
			c[i] = sc.next().toCharArray();
		for(int t=0;t<2;t++)
			for(int i=0;i<N;i++)
				for(int j=0;j<N;j++)
					if(t==0 && va[i][j]==0) { dfs(c,va,i,j,t,N); ra++;}
					else if(t==1 && vb[i][j]==0) {dfs(c,vb,i,j,t,N); rb++;}
		System.out.println(ra+" "+rb);
	}

	static void dfs(char[][] c,int[][] v,int i,int j,int t,int N){
		int[][] d = {{0,1},{0,-1},{1,0},{-1,0}};
		v[i][j]=1;
		for(int k=0;k<4;k++){
			int ni =i+d[k][0], nj =j+d[k][1];
			if(ni>=0 && ni<N && nj>=0&&nj<N&& v[ni][nj]==0 && ((t==0 && c[i][j]==c[ni][nj]) || (t==1 && (c[ni][nj]==c[i][j] ||c[i][j]=='R'&& c[ni][nj]=='G' || c[i][j]=='G'&& c[ni][nj]=='R'))))
				dfs(c,v,ni,nj,t,N);
		}
	}
}