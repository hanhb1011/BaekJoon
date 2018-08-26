import java.util.*;

public class Main{
	public static void main(String[] args){
		int i=0, c[]=new int[1000000];
		c[0] = new Scanner(System.in).nextInt();
		while(c[i]!=1) {
			i++;
			if(c[i-1]%2==0)
				c[i]=c[i-1]/2;
			else
				c[i]=3*c[i-1]+1;
		}
		System.out.println(i+1);
	}
}