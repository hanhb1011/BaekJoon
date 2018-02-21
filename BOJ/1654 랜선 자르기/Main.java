import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int K=sc.nextInt(), N=sc.nextInt(), idx=0, max=0, n=Integer.MAX_VALUE,cn=0;
		int[] L=Arrays.stream(new int[K]).map(i->sc.nextInt()).toArray();
		while(cn<35) {
			cn++;
			int l=idx+n/2;
			int c=0;
			for(int i=0;i<K;i++)
				c+=L[i]/l;
			idx=l;
			if(c>=N) {
				max=Math.max(l, max);
				n=Math.abs(n/2)+1;
			} else
				n=-Math.abs(n/2)-1;
		}
		System.out.println(max);
	}
}