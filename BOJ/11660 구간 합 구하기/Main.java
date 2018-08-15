import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt(), a[][]=new int[N][N],s[][]=new int[N][N];
		for(int i=0;i<N;i++)
			for(int j=0;j<N;j++) {
				a[i][j]=sc.nextInt();
				s[i][j]=(j==0?0:s[i][j-1])+a[i][j];
			}
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<M;i++) {
			int y1=sc.nextInt()-1,x1=sc.nextInt()-1,y2=sc.nextInt()-1,x2=sc.nextInt()-1;
			long sum=0;
			for(int y=y1;y<=y2;y++) {
				if(x1==0)
					sum+=s[y][x2];
				else
					sum+=s[y][x2]-s[y][x1-1];
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}
}