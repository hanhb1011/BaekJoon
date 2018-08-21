import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N,M;
		String[] a= br.readLine().split(" ");
		N=Integer.valueOf(a[0]);
		M=Integer.valueOf(a[1]);
		while(N!=0 && M!=0) {
			HashMap<Integer, Integer> hash = new HashMap<>();
			int res=0;
			for(int i=0;i<N+M;i++) {
				int k=Integer.valueOf(br.readLine());
				Integer v=hash.get(k);
				if(v!=null && v==1)
					res++;
				hash.put(k, v==null?1:v+1);
			}
			System.out.println(res);
			a= br.readLine().split(" ");
			N=Integer.valueOf(a[0]);
			M=Integer.valueOf(a[1]);
		}
	}
}