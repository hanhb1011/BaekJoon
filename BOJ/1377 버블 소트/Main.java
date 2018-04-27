import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		class Num{int n,i; Num(int a,int b){n=a;i=b;}}
		int N=sc.nextInt(), res=1;
		Num nums[] = new Num[N];
		Num sorted[] = new Num[N];
		for(int i=0;i<N;i++)
			nums[i]=sorted[i]=new Num(sc.nextInt(),i);
		Arrays.sort(sorted, (a,b)->a.n!=b.n?a.n-b.n:a.i-b.i);
		
		for(int i=0;i<N;i++)
			if(i < sorted[i].i)
				res = Math.max(res, sorted[i].i-i+1);
		
		System.out.println(res);
	}
}