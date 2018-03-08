import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		while(sc.hasNextLine()) {
			int[] a=new int[4];
			for(char c:sc.nextLine().toCharArray()) {
				a[0]+=c<123 && c>96?1:0;
				a[1]+=c>64 && c<91?1:0;
				a[2]+=c>47 && c<58?1:0;
				a[3]+=c==' '?1:0;
			}
			System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]);
		}
	}
}