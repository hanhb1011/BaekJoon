import java.util.*;
public class Main{
	public static void main(String[] args){
		int n = 1000-new Scanner(System.in).nextInt(),c=0;
		for(;n>0;c++)
			n-=n>=500?500:n>=100?100:n>=50?50:n>=10?10:n>=5?5:1;
		System.out.println(c);
	}
}