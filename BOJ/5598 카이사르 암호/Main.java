import java.util.*;

public class Main{
	public static void main(String[] args){
		char[] s = new Scanner(System.in).next().toCharArray();
		for(int i=0;i<s.length;i++)
			s[i]=(char) (s[i]-3<'A'?s[i]-'A'+'X':s[i]-3);
		System.out.println(String.valueOf(s));
	}
}