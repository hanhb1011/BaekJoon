import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		String s = new Scanner(System.in).next(), v = "aeiou";
		int res = 0;
		for(int i=0; i<s.length(); i++)
			for(int j=0; j<5; j++)
				if(s.charAt(i) == v.charAt(j))
					res++;
		System.out.println(res);
	}
}