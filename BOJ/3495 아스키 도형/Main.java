import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int H=sc.nextInt(),W=sc.nextInt(),A=0,B=0;
		while(H-->0){
			char[] s=sc.next().toCharArray();
			boolean in=false;
			for(int i=0;i<W;i++) {
				if(s[i]=='.')
					B+=in?1:0;
				else{
					A++;
					in=!in;
				}
			}
		}
		System.out.println(A/2+B);
	}
}