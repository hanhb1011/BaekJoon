import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
			String s=sc.next();
			List<Character> l=new LinkedList<>(); ListIterator<Character> i=l.listIterator();
			for(int k=0;k<s.length();k++){
				char c=s.charAt(k);
				try{
					if(c=='-') {i.previous();i.remove();}
					else if(c=='>') i.next();
					else if(c=='<') i.previous();
					else i.add(c);
				}catch(Exception e) {}
			}
			StringBuffer sb=new StringBuffer();
			l.stream().forEach(c->sb.append(c));
			System.out.println(sb);
		}
	}
}