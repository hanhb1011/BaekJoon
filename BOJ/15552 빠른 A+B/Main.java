import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer sb=new StringBuffer();
		int T=sc.nextInt();
		while(T-->0)
			sb.append(sc.nextInt()+sc.nextInt()).append("\n");
		System.out.println(sb);
	}
}