import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(), K=sc.nextInt(), a[][]=new int[2][6], res=0;
		for(int i=0;i<N;i++)
			a[sc.nextInt()][sc.nextInt()-1]++;
		for(int i=0;i<6;i++)
			for(int j=0;j<2;j++)
				res+=a[j][i]/K+(a[j][i]%K==0?0:1);
		System.out.println(res);
	}
}