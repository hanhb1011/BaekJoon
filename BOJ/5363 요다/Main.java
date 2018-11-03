import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); sc.nextLine();
		while(n-->0) {
			String []s = sc.nextLine().split(" ");
			for(int i=2;i<s.length;i++)
				System.out.print(s[i]+" ");
			System.out.println(s[0] +" " + s[1]);
		}
	}
}
