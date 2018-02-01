import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int J=sc.nextInt(), I=sc.nextInt(), H=sc.nextInt(), tot=0, cnt=0, res=0;
		int [][][]t =new int[H][I][J];
		int [][]d = {{0,0,1},{0,0,-1},{0,1,0},{0,-1,0},{1,0,0},{-1,0,0}};
		class Loc{int h,i,j;Loc(int hh,int ii,int jj){h=hh;i=ii;j=jj;}}
		Queue <Loc> q = new ArrayDeque<>();
		for(int h=0;h<H;h++)
			for(int i=0;i<I;i++)
				for(int j=0;j<J;j++) {
					t[h][i][j]=sc.nextInt();
					if(t[h][i][j]==1) {
						q.add(new Loc(h,i,j));
						tot++;
					}
				}
		
		while(!q.isEmpty()) {
			cnt++;
			Loc l=q.poll();
			for(int i=0; i<6; i++)
				if(l.h+d[i][0]>=0 && l.h+d[i][0]<H && l.i+d[i][1] >=0 && l.i+d[i][1]<I && l.j+d[i][2]>=0 && l.j+d[i][2]<J &&t[l.h+d[i][0]][l.i+d[i][1]][l.j+d[i][2]]==0) {
					t[l.h+d[i][0]][l.i+d[i][1]][l.j+d[i][2]] = t[l.h][l.i][l.j]+1;
					q.add(new Loc(l.h+d[i][0],l.i+d[i][1],l.j+d[i][2]));
					res=Math.max(t[l.h+d[i][0]][l.i+d[i][1]][l.j+d[i][2]], res);
				}
		}
		
		boolean b = false;
		for(int h=0;h<H;h++)
			for(int i=0;i<I;i++)
				for(int j=0;j<J;j++)
					if(t[h][i][j]==0)
						b=true;
		
		System.out.println(b?-1:tot==cnt?0:(res-1));
	}
}