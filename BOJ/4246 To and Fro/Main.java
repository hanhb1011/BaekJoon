import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n;
		while((n=sc.nextInt())!=0) {
			String s=sc.next(), res="";
			int i=0,l=0;
			boolean b = true;
			while(l<n) {
				res+=s.charAt(i)+"";
				i+=b?(n*2-1-l*2):(1+l*2);
				b=!b;
				if(i>=s.length()) {
					i=++l;
					b=true;
				}
			}
			System.out.println(res);
		}	
	}
}