import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long min = sc.nextLong(), max = sc.nextLong(), smax=(long)Math.sqrt(max);
		int[] p = new int[(int)(max-min+1)];

		for(long i=2;i<=smax;i++) {
			long sq = i*i;
			long mul = (long)(Math.ceil((double)min/sq))*sq;
			for(long j=mul; j<max+1; j+=sq)
				p[(int)(j-min)]=1;
		}

		System.out.println(Arrays.stream(p).reduce(0, (i,j)->{return j==0?i+1:i;}));
	}
}