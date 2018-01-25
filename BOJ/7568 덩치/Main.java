import java.util.Scanner;

public class Main {
	static int a=0,b=0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [][]p = new int[N][3];
		for(int i=0;i<N;i++)
			for(int j=0;j<2;j++)
				p[i][j] = sc.nextInt();
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++)
				if(p[i][0]<p[j][0] && p[i][1]<p[j][1])
					p[i][2]++;
			System.out.print(p[i][2]+1+" ");
		}
	}
}