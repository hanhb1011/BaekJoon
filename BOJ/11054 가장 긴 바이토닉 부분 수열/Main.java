import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int []a = Arrays.stream(new int[sc.nextInt()]).map(i->sc.nextInt()).toArray();
		int [][]d = new int[a.length][2];
		int r=0;
		for(int i=0; i<a.length; i++) {
			d[i][0]=1;d[i][1]=1;
			for(int j=0; j<i; j++) {
				d[i][0]=a[i]>a[j]?Math.max(d[i][0], d[j][0]+1):d[i][0];
				d[i][1]=a[i]<a[j]?Math.max(d[j][0]+1,Math.max(d[i][1], d[j][1]+1)):d[i][1];
			}
			r=Math.max(r, Math.max(d[i][0], d[i][1]));
		}
		System.out.println(r);
	}
}