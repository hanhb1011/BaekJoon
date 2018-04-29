import java.util.*;

public class Main{
	static int N,R, r[]={0,0,0}, a[][]=new int[2187][2187];
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		for(int i=0;i<N*N;i++)
			a[i/N][i%N]=sc.nextInt();
		if((R=go(N,0,0))!=2)
			r[R+1]++;
		for(int n:r)
			System.out.println(n);
	}

	static int go(int n, int i, int j){
		if(n==1)
			return a[i][j];
		int[] b=new int[9],c={0,0,0};

		for(int w=0;w<9;w++)
			if((b[w]=go(n/3,i+(w/3)*(n/3), j+(w%3)*(n/3)))!=2)
				c[b[w]+1]++;

		if(c[0]==9 || c[1]==9 || c[2]==9)
			return b[0];
		for(int w=0;w<9;w++)
			if(b[w]!=2)
				r[b[w]+1]++;
		return 2;
	}
}