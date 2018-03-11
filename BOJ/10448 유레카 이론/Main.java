import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int []n=new int[45], d=new int[1001];
		for(int i=1;i<45;i++)
			n[i]=i*(i+1)/2;
		for(int i=1;i<45;i++)
			for(int j=1;j<45;j++)
				for(int k=1;k<45;k++)
					if(n[i]+n[j]+n[k]<1001)
						d[n[i]+n[j]+n[k]]=1;
		int T=sc.nextInt();
		while(T-->0)
			System.out.println(d[sc.nextInt()]);
	}
}