import java.util.*;

public class Main{
	public static void main(String[] args){
		int K=new Scanner(System.in).nextInt(),MAX=10000000, p[]=new int[MAX],pi=0;
		for(int i=2;i<MAX;i++) {
			if(p[i]==1)
				continue;
			pi++;
			if(pi==K) {
				System.out.println(i);
				return;
			}
			for(int j=i*2;j<MAX;j+=i)
				p[j]=1;
		}
	}
}