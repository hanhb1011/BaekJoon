import java.util.*;

public class Main {

	public static void main(String[] args){
		String S=new Scanner(System.in).next();
		int r=0,N=S.length(), f[][]=new int[N][N];
		for(int k=0;k<N;k++) {
			int j=0;
			char[] s=S.substring(k).toCharArray();
			for(int i=1;i<s.length;i++) {
				while(j>0&&s[i]!=s[j])
					j=f[k][j-1];
				if(s[i]==s[j])
					f[k][i]=++j;
				r=Math.max(r, j);
			}
		}
		System.out.println(r);
	}
}
