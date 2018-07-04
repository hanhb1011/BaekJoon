import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int c[]=new int[26],N=sc.nextInt();
		String r="";
		while(N-->0)
			c[sc.next().charAt(0)-97]++;
		for(int i=0;i<26;i++)
			if(c[i]>4)
				r+=(char)(i+97);
		System.out.println(r.length()>0?r:"PREDAJA");
	}
}