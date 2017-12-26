import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Integer> deq = new ArrayDeque<>();
		int N = scanner.nextInt();
		
		for(int i=0; i<N; i++) {
			String cmd = scanner.next();
			
			switch(cmd) {
			case "push_front":
				deq.offerFirst(scanner.nextInt());
				break;
			case "push_back":
				deq.offerLast(scanner.nextInt());
				break;
			case "pop_front":
				Integer pf = deq.pollFirst();
				sb.append((pf==null?-1:pf)+"\n");
				break;
			case "pop_back":
				Integer pb = deq.pollLast();
				sb.append((pb==null?-1:pb)+"\n");
				break;
			case "size":
				sb.append(deq.size()+"\n");
				break;
			case "empty":
				sb.append((deq.isEmpty()? 1:0)+"\n");
				break;
			case "front":
				Integer f = deq.peekFirst();
				sb.append((f==null?-1:f)+"\n");
				break;
			case "back":
				Integer b = deq.peekLast();
				sb.append((b==null?-1:b)+"\n");
				break;
			}
		}
		System.out.println(sb);
		
	}

}

