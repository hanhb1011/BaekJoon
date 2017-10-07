import java.util.Scanner;

class node{
	char c;
	node left;
	node right;
	node(char c){this.c = c;}
	public void set(node left, node right) {
		this.left = left;
		this.right = right;
	}
}

public class Main {


	public static void traverse(node node, int type) {
		switch(type) {
		case 1 : 
			System.out.print(node.c);
			if(node.left!=null)
				traverse(node.left, 1);
			if(node.right!=null)
				traverse(node.right, 1);
			break;
		case 2 :
			if(node.left!=null)
				traverse(node.left, 2);
			System.out.print(node.c);
			if(node.right!=null)
				traverse(node.right, 2);
			break;
		case 3 : 
			if(node.left!=null)
				traverse(node.left, 3);
			if(node.right!=null)
				traverse(node.right, 3);
			System.out.print(node.c);
			break;
		}
	}


	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);

		//A 65
		int N = scanner.nextInt();
		node[] nodes = new node[N];

		for(int i=0; i<N; i++)
			nodes[i] = new node((char)(i+65));

		for(int i=0; i<N; i++) {
			String []input = {scanner.next(), scanner.next(), scanner.next()};
			node l = input[1].charAt(0)!='.' ? nodes[input[1].charAt(0)-65] : null;
			node r = input[2].charAt(0)!='.' ? nodes[input[2].charAt(0)-65] : null;
			nodes[input[0].charAt(0)-65].set(l, r);
		}
		traverse(nodes[0], 1);
		System.out.println();
		traverse(nodes[0], 2);
		System.out.println();
		traverse(nodes[0], 3);
		System.out.println();



	}
}