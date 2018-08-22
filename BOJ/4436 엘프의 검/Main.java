import java.util.*;

public class Main{
	static int res;
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			long v=Long.valueOf(sc.nextLine());
			int k=1,r=0,n[]=new int[10];
			while(r!=10){
				String s= String.valueOf(k++*v);
				for(int i=0;i<s.length();i++){
					int j=s.charAt(i)-48;
					if(n[j]==0) {
						n[j] = 1;
						r++;
					}
				}
			}
			System.out.println(k-1);
		}
	}
}