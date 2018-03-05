import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean valid=true;
		Stack<Character> stk = new Stack<>();
		int[] vals = new int[30];

		for(int i=0;i<s.length();i++) {
			char a= s.charAt(i);
			if(a=='(' || a=='[') {
				stk.push(a);
				continue;
			}
			if(stk.isEmpty()) {
				valid=false;
				break;
			}
			char b = stk.pop();
			if(a==')') {
				if(b!='(')
					valid=false;
				vals[stk.size()] += vals[stk.size()+1] == 0 ? 2 : vals[stk.size()+1]*2;
			} else { 
				if(b!='[')
					valid=false;
				vals[stk.size()] += vals[stk.size()+1] == 0 ? 3 : vals[stk.size()+1]*3;
			}
			vals[stk.size()+1] = 0;
		}

		System.out.println(valid? vals[0] : 0);
	}
}