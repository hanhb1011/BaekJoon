import java.util.Scanner;

public class Main {

	public static void main(String [] args) {
		//input
		Scanner scanner = new Scanner(System.in);
		int Y = scanner.nextInt();
		int X = scanner.nextInt();
		int current_y = scanner.nextInt();
		int current_x = scanner.nextInt();
		int numOfCommands = scanner.nextInt();
		int [][]graph = new int[Y][X];
		int []commands = new int[numOfCommands];
		for(int i=0; i<Y; i++)
			for(int j=0; j<X; j++)
				graph[i][j] = scanner.nextInt();
		for(int i=0; i<numOfCommands; i++)
			commands[i] = scanner.nextInt();
		StringBuilder result = new StringBuilder(2000);
		//end of input

		//initialize
		class Face{ // 주사위의 면
			int value;
			Face up, down, left, right;
			Face top;
			int index; // temp
			public void set(Face up, Face down, Face left, Face right, int index, Face top) {
				this.up = up;
				this.down = down;
				this.left = left;
				this.right = right;
				this.index = index;
				this.top = top;
			}
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return String.valueOf(value);
			}
		}
		Face [] faces = {null, new Face(), new Face(), new Face(), new Face(), new Face(), new Face()};
		faces[1].set(faces[2], faces[5], faces[4], faces[3], 1, faces[6]);
		faces[2].set(faces[6], faces[1], faces[4], faces[3], 2, faces[5]);
		faces[3].set(faces[1], faces[6], faces[2], faces[5], 3, faces[4]);
		faces[4].set(faces[1], faces[6], faces[5], faces[2], 4, faces[3]);
		faces[5].set(faces[1], faces[6], faces[4], faces[3], 5, faces[2]);
		faces[6].set(faces[5], faces[2], faces[3], faces[4], 6, faces[1]);
		
		Face current = faces[1];
		if(graph[current_y][current_x]!=0) {
			current.value = graph[current_y][current_x];
			graph[current_y][current_x] = 0;
		} else {
			graph[current_y][current_x] = current.value;
		}

		//end of initialize
		System.out.println("밑면index : " + current.index + "밑면 val : "+ current.value+  " 윗면index : "+ current.top.index + " up " + current.up.index + "윗면val : " + current.top.value );
		for(int i=0; i<numOfCommands; i++) {
			
			if(commands[i]==1) { //동
				current = current.right;
				current_x++;

				if(graph[current_y][current_x]!=0) {
					current.value = graph[current_y][current_x];
					graph[current_y][current_x] = 0;
				} else {
					graph[current_y][current_x] = current.value;
				}
				result.append(current.top.value + "\n");
				
			} else if(commands[i] ==2) { //서
				current = current.left;
				current_x--;
				if(graph[current_y][current_x]!=0) {
					current.value = graph[current_y][current_x];
					graph[current_y][current_x] = 0;
				} else {
					graph[current_y][current_x] = current.value;
				}
				result.append(current.top.value + "\n");

			} else if(commands[i] ==3) { //북
				current = current.up;
				current_y--;
				if(graph[current_y][current_x]!=0) {
					current.value = graph[current_y][current_x];
					graph[current_y][current_x] = 0;
				} else {
					graph[current_y][current_x] = current.value;
				}
				result.append(current.top.value + "\n");

			} else { //남
				current = current.down;
				current_y++;
				if(graph[current_y][current_x]!=0) {
					current.value = graph[current_y][current_x];
					graph[current_y][current_x] = 0;
				} else {
					graph[current_y][current_x] = current.value;
				}
				result.append(current.top.value + "\n");
			}
			System.out.println("밑면index : " + current.index + "밑면 val : "+ current.value+  " 윗면index : "+ current.top.index + " up " + current.up.index + "윗면val : " + current.top );
		}
		
		System.out.println(result);
		
	}

}