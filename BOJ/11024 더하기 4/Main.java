import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		for(int t=0;t<T;t++){
			StringTokenizer s=new StringTokenizer(sc.nextLine());
			System.out.println(Arrays.stream(new int[s.countTokens()]).map(i->Integer.valueOf(s.nextToken())).reduce(0,(i,j)->i+j));
		}
	}
}