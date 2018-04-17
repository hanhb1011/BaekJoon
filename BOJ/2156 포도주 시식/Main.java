import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),a[]=Arrays.stream(new int[N]).map(i->sc.nextInt()).toArray(),d[][]=new int[N][2],r=d[0][0]=a[0];
		for(int i=1;i<N;i++){
			d[i][0]=(i>2?Math.max(Math.max(d[i-3][0],d[i-3][1]),Math.max(d[i-2][0],d[i-2][1])):i>1?Math.max(d[i-2][0],d[i-2][1]):0)+a[i];
			d[i][1]=d[i-1][0]+a[i];
			r=Math.max(r,Math.max(d[i][0],d[i][1]));
		}
		System.out.println(r);
	}
}