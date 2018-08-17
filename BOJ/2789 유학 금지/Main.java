import java.util.*;

public class Main{
	public static void main(String[] args){
		String s= new Scanner(System.in).next();
		for(int i=0;i<s.length();i++)
			if(!"CAMBRIDGE".contains(s.charAt(i)+""))
				System.out.print(s.charAt(i));
	}
}