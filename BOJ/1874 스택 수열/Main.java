import java.util.Scanner;

public class Main {

	static int[] stack;
	static int idx=0;
	static StringBuilder sb = new StringBuilder();
	
	public static int peek() { //가장 마지막에 들어온 값 확인
		return idx>0 ? stack[idx-1] : -1;
	}
	
	public static void push(int num) {
		sb.append("+\n");
		stack[idx++] = num;
	}
	
	public static int pop() {
		sb.append("-\n");
		return stack[idx--];
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		stack = new int[N+1];
		int []input = new int[N+1];
		int cur = 0; //현재 어디까지 push했는지
		for(int i=1; i<=N; i++)
			input[i] =scanner.nextInt();
		
		for(int i=1; i<=N; i++) {
			int target = input[i];
			
			if(target>=peek()) {
				if(stack[idx] == target)
					pop();
				else {
					while(peek() != target)
						push(++cur);
					pop();
				}
			} else {
				System.out.println("NO");
				return;
			}
		}
		
		System.out.println(sb);
	}
}
