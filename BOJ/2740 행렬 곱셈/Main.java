import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),M=sc.nextInt(),a[][]=new int[N][M];
		for(int i=0;i<N*M;i++)
			a[i/M][i%M]=sc.nextInt();
		int L=sc.nextInt(),K=sc.nextInt(),b[][]=new int[L][K];
		for(int i=0;i<L*K;i++)
			b[i/K][i%K]=sc.nextInt();

		for(int i=0;i<N;i++) {
			for(int j=0;j<K;j++) {
				int sum=0;
				for(int k=0;k<M;k++)
					sum+=a[i][k]*b[k][j];
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}
}