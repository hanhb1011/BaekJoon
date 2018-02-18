import java.util.*;

class P{long x,y; P(long xx, long yy){x=xx;y=yy;}}
public class Main{
	static int N;
	static P[] points;
	static long count;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		N =sc.nextInt();
		points = Arrays.stream(new P[N]).map(i-> new P(sc.nextInt(), sc.nextInt())).toArray(P[]::new);
		P[] p = new P[3];
		for(int i=0;i<N-2;i++) {
			p[0] = points[i];
			r(0, p, i);
		}
		System.out.println(count);
	}
	
	static void r(int c, P[] p, int idx) {
		if(c==2) {
			long[] l = new long[3];
			for(int i=0;i<3;i++)
				l[i]=(p[i].x-p[(i+1)%3].x)*(p[i].x-p[(i+1)%3].x)+(p[i].y-p[(i+1)%3].y)*(p[i].y-p[(i+1)%3].y);
			for(int i=0;i<3;i++)
				if(l[i]+l[(i+1)%3]==l[(i+2)%3]) {
					count++;
					return;
				}
			return;
		}
		
		for(int i=idx+1;i<N;i++) {
			p[c+1] = points[i];
			r(c+1, p, i);
		}
	}
}