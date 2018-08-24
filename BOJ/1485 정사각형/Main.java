import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0) {
			long p[][]=new long[4][2];
			boolean a=false, b=false;
			for(int i=0;i<4;i++) {
				p[i][0]=sc.nextLong();
				p[i][1]=sc.nextLong();
			}
			HashMap<Long, Integer> map=new HashMap<>();
			
			for(int i=0;i<4;i++) {
				for(int j=0;j<4;j++) {
					if(j==i)
						continue;
					long d = Math.abs((p[i][0]-p[j][0])*(p[i][0]-p[j][0])+(p[i][1]-p[j][1])*(p[i][1]-p[j][1]));
					if(map.get(d)==null)
						map.put(d, 1);
					else
						map.put(d, map.get(d)+1);
				}
			}
			for(int v : map.values()) {
				if(v==4)
					a=true;
				else if(v==8)
					b=true;
			}
			if(a && b)
				System.out.println(1);
			else
				System.out.println(0);
		}
	}
}