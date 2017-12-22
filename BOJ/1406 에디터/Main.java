import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		LinkedList<Character> str = new LinkedList<>();
		ListIterator<Character> idx = str.listIterator(str.size());
		for(int i=0; i<s.length(); i++)
			idx.add(s.charAt(i));
		
		int N = scanner.nextInt();
		
		for(int i=0; i<N; i++) {
			String cmd = scanner.next();
			try {
				if(cmd.equals("L"))
					idx.previous();
				else if(cmd.equals("D"))
					idx.next();
				else if(cmd.equals("B")) {
					idx.previous();
					idx.remove();
				} else {
					idx.add(scanner.next().charAt(0));
				}
			} catch (Exception e) {}
		}
		Iterator<Character> it = str.iterator();
		StringBuilder sb = new StringBuilder(600000);
		while(it.hasNext())
			sb.append(it.next());
		System.out.println(sb);
	}
}

