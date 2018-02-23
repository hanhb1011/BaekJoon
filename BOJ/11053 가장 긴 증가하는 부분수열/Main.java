import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] a=Arrays.stream(new int[N]).map(i->sc.nextInt()).toArray(),d=new int[N];

		for(int i=1;i<N;i++)
			for(int j=0;j<i;j++)
				if(a[j]<a[i])
					d[i]=Math.max(d[i],d[j]+1);

		System.out.println(Arrays.stream(d).max().getAsInt()+1);
	}
}