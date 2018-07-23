import java.util.*;
public class Main{
	public static void main(String[] args){
		String[] a={"F","D-","D0","D+","C-","C0","C+","B-","B0","B+","A-","A0","A+"},
				b={"0.0","0.7","1.0","1.3","1.7","2.0","2.3","2.7","3.0","3.3","3.7","4.0","4.3"};
		System.out.println(b[Arrays.asList(a).indexOf(new Scanner(System.in).next())]);
	}
}