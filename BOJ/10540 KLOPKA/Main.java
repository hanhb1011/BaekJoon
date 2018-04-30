import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),ax=100,ay=100,bx=1,by=1,L;
		while(N-->0){
			int x=sc.nextInt(),y=sc.nextInt();
			ax=Math.min(ax, x);
			bx=Math.max(bx, x);
			ay=Math.min(ay, y);
			by=Math.max(by, y);
		}
		L=Math.max(by-ay, bx-ax);
		System.out.println(L*L);
	}
}