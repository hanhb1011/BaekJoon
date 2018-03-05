import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt(),Y=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt(),T=sc.nextInt();
		int[]d={1,1};

		for(int t=0;t<T;t++) {
			x+=d[1]; y+=d[0];
			if ((x==0&&y==0)||(x==X&&y==Y)||(x==0&&y==Y)||(x==X&&y==0)) {
				d[0]*=-1; d[1]*=-1;
			} else if (y==Y || y==0)
				d[0]*=-1;
			else if (x==X || x==0)
				d[1]*=-1;
		}

		System.out.println(x+" "+y);
	}
}