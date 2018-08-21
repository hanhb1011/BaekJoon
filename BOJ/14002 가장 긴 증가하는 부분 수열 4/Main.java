import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt(), d[][]=new int[N][2], a[]=Arrays.stream(new int[N]).map(i->sc.nextInt()).toArray(),maxi=0,c=0;
		for(int i=0;i<N;i++)
			d[i][1]=-1;
		d[0][0]=1;

		for(int i=1;i<N;i++) {
			d[i][0]=1;
			for(int j=0;j<i;j++)
				if(a[j]<a[i] && d[j][0]+1>d[i][0]) {
					d[i][0]=d[j][0]+1;
					d[i][1]=j;
					maxi = d[maxi][0] > d[i][0]? maxi:i;
				}
		}
		List<Integer> res=new ArrayList();
		while(maxi!=-1) {
			res.add(a[maxi]);
			maxi=d[maxi][1];
		}
		System.out.println(res.size());
		for(int i=res.size()-1;i>=0;i--)
			System.out.print(res.get(i)+" ");
	}
}