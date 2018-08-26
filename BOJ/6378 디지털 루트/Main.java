import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s;
		while(!(s=sc.next()).equals("0")){
			while(s.length()>1) {
				int sum=0;
				for(int i=0;i<s.length();i++)
					sum+=s.charAt(i)-'0';
				s=sum+"";
			}
			System.out.println(s);
		}
	}
}