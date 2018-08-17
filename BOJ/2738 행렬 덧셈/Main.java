import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt(),a[][]=new int[N][M];
		for(int t=0;t<2;t++)
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					a[i][j]+=sc.nextInt();
					if(t==1) System.out.print(a[i][j]+" ");
				}
				if(t==1) System.out.println();
			}
	}
}