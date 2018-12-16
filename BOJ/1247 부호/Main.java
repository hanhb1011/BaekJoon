import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int t=0;t<3;t++) {
			int n=Integer.parseInt(br.readLine());
			BigInteger bi = new BigInteger("0");
			while(n-->0)
				bi =bi.add(new BigInteger(br.readLine()));
			int sign = bi.signum();
			System.out.println(sign == -1? "-":sign==1?"+":"0");
		}
	}
}