import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int J=sc.nextInt(),I=sc.nextInt(), tot=0, cnt=0, res=0;
		int [][]t =new int[I][J], d={{0,1},{0,-1},{1,0},{-1,0}};
		class Loc{int i,j;Loc(int ii,int jj){i=ii;j=jj;}}
		Queue <Loc> q = new ArrayDeque<>();
		for(int i=0;i<I;i++)
			for(int j=0;j<J;j++) {
				t[i][j]=sc.nextInt();
				if(t[i][j]==1) {
					q.add(new Loc(i,j));
					tot++;
				}
			}

		while(!q.isEmpty()) {
			cnt++;
			Loc l=q.poll();
			for(int i=0; i<4; i++)
				if(l.i+d[i][0] >=0 && l.i+d[i][0]<I && l.j+d[i][1]>=0 && l.j+d[i][1]<J &&t[l.i+d[i][0]][l.j+d[i][1]]==0) {
					t[l.i+d[i][0]][l.j+d[i][1]] =t[l.i][l.j]+1;
					q.add(new Loc(l.i+d[i][0],l.j+d[i][1]));
					res=Math.max(t[l.i+d[i][0]][l.j+d[i][1]], res);
				}
		}
		
		for(int i=0;i<I;i++)
			for(int j=0;j<J;j++)
				if(t[i][j]==0)
					res=0;
		System.out.println(tot==cnt?0:(res-1));
	}
}