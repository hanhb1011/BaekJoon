import java.util.*;

public class Main{
	public static void main(String[] args){
		int n = new Scanner(System.in).nextInt();
		int ans = 0, idx = 0, a[]= new int[8]; a[0]=9;
		for(int i=1;i<8;i++)
			a[i]=a[i-1]*10+9;
		
		for(int i=1;i<=n;i++)
			if(i<=a[idx])
				ans+=idx+1;
			else 
				ans+=++idx+1;
		System.out.println(ans);
	}
}