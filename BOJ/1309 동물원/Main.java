import java.util.*;
public class Main{
	public static void main(String[] args){
		int N = new Scanner(System.in).nextInt();
		int [][][]d = new int[N+1][2][2];
		d[0][0][0]=1; d[0][0][1]=1;
		d[0][1][0]=2; d[0][1][1]=1;
		
		for(int i=1; i<=N; i++) {
			d[i][0][0]=(d[i-1][1][0]+d[i-1][1][1])%9901;
			d[i][0][1]=d[i-1][0][0]%9901;
			d[i][1][0]=(d[i][0][0]+d[i][0][1])%9901;
			d[i][1][1]=d[i][0][0]%9901;
		}
		
		System.out.println((d[N-1][1][0]+d[N-1][1][1])%9901);
	}
}