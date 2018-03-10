import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int N =sc.nextInt(), M=sc.nextInt(), res=1;
		char[][] n=Arrays.stream(new char[N][M]).map(i->sc.next().toCharArray()).toArray(char[][]::new);

		for(int l=1;l<Math.min(N, M);l++)
			for(int i=0;i<N;i++)
				for(int j=0;j<M;j++)
					if(i+l<N && j+l<M && n[i][j]==n[i+l][j] && n[i+l][j]==n[i+l][j+l] && n[i+l][j+l]==n[i][j+l])
						res=Math.max(res, (l+1)*(l+1));

		System.out.println(res);
	}
}