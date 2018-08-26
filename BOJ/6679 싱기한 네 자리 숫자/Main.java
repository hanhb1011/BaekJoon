import java.math.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		for(int i=2992;i<10000;i++) {
			BigInteger n = new BigInteger(i+"");
			String[] a = {n.toString(), n.toString(12), n.toString(16)};
			int[] s= new int[3];
			for(int j=0;j<3;j++) {
				int sum=0;
				for(int k=0;k<a[j].length();k++)
					sum+=a[j].charAt(k)<97?a[j].charAt(k)-48:a[j].charAt(k)-87;
				s[j]=sum;
			} 
			if(s[0]==s[1] && s[1]==s[2])
				System.out.println(i);
		}	
	}
}