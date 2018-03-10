import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int[][]d=new int[41][2];
		d[0][0]=d[1][1]=1;
		for(int i=2;i<41;i++) {
			d[i][0]=d[i-1][0]+d[i-2][0];
			d[i][1]=d[i-1][1]+d[i-2][1];
		}
		int t=sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			System.out.println(d[n][0]+" "+d[n][1]);
		}
	}
}