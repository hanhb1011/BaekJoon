import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T=10003, r1=sc.nextInt(), c1=sc.nextInt(), r2=sc.nextInt(), c2=sc.nextInt();		
		int a[][]=new int[T][T],d[][]={{0,1},{-1,0},{0,-1},{1,0}},n=1,y=T/2,x=T/2,c=0,max=0;

		for(int l=1;l<=T;l++) {
			for(int k=0;k<2;k++) {
				for(int i=0;i<l;i++) {
					if(y+d[c][0]>=0 && y+d[c][0]<T && x+d[c][1]>=0 && x+d[c][1]<T) {
						if(y>=r1+5001 && y<=r2+5001 && x>=c1+5001 && x<=c2+5001)
							max=Math.max(max, n);
						a[y][x] = n++;
						y+=d[c][0]; x+=d[c][1];
					}
				}
				c=(c+1)%4;
			}
		}
		StringBuffer sb= new StringBuffer();
		int l=String.valueOf(max).length();
		for(int i=r1+5001;i<=r2+5001;i++) {
			for(int j=c1+5001;j<=c2+5001;j++) {
				int len=l-String.valueOf(a[i][j]).length()+1;
				for(int k=0;k<(j==c1+5001?len-1:len);k++)
					sb.append(" ");
				sb.append(a[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}