import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int M=sc.nextInt(), N=sc.nextInt(), a[][]=new int[M][M], DY[]= {0,1,0,-1}, DX[]= {1,0,-1,0}, d=0,y=0,x=0;
		while(N-->0) {
			String cmd=sc.next();
			if(cmd.equals("MOVE")) {
				int l=sc.nextInt(), ny=y+DY[d]*l, nx=x+DX[d]*l;
				if(ny<0 || ny>=M || nx<0 || nx>=M) {
					System.out.println(-1);
					return;
				}
				y=ny;
				x=nx;
			} else
				if(sc.nextInt()==0)
					d=(d+1)%4;
				else
					d=(d+3)%4;
		}
		System.out.println(x+" "+y);
	}
}