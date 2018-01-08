import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.valueOf(br.readLine());
		
		long []nums = new long[N+1];
		nums[0] = 1;
		for(int i=1;i<=N;i++) {
			nums[i] = nums[i-1]*i;
			while(nums[i]%10==0) {
				nums[i]/=10;
			}
			nums[i] = nums[i]%1000000000000l;
		}
		nums[N]=nums[N]%100000;
		String result = "";
		int count = 5-String.valueOf(nums[N]).length();
		for(int i=0; i<count; i++)
			result+="0";
		bw.write(result+nums[N]);
		bw.flush();
	}
}