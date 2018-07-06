import java.util.*;

public class Main{
	static int num[]=new int[10],N,cnt=Integer.MAX_VALUE;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		int M=sc.nextInt();
		while(M-->0)
			num[sc.nextInt()]=1;
		get(0,0,0,true);
		System.out.println(Math.min(Math.abs(100-N), cnt));
	}

	static void get(int n, int c,int i,boolean isFirst) {
		if(i>6)
			return;
		if(!isFirst)
			cnt=Math.min(cnt, c+Math.abs(N-n));
		for(int j=0;j<10;j++)
			if(num[j]==1)
				continue;
			else
				get(n+j*(int)Math.pow(10, i),c+1,i+1,false);
	}
}