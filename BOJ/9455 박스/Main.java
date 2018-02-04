import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int t=0; t<T; t++) {
			int M=sc.nextInt(), N=sc.nextInt(),c=0;
			int[][]b=new int[M][N];
			for(int i=0;i<M;i++)
				for(int j=0;j<N;j++)
					b[i][j]=sc.nextInt();
			for(int j=0;j<N;j++) {
				int l=b[M-1][j];
				for(int i=M-2;i>=0;i--)
					if(b[i][j]==1) {
						l++;
						c+=M-i-l;
					}
			}
			System.out.println(c);
		}
	}
}