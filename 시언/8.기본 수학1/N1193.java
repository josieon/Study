package baekjoon;
import java.io.*;
public class N1193 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum=0;
		int range=1;
		while(sum < N) {
			sum += range;
			range++;
		}
		if(range%2!=0) {
			System.out.println((N-((range*(range-1))/2-range+1))+"/"+(range-((N-((range*(range-1))/2-range+1)))));
		}
		else {
			System.out.println(range-((N-((range*(range-1))/2-range+1)))+"/"+(N-((range*(range-1))/2-range+1)));
		}
	}
}
