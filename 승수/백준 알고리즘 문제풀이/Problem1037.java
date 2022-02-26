import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
//문제를 잘못이해함 조심하자
public class Problem1037 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());	
		int[] arr = new int[number];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<number;i++)
		{
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		System.out.println(arr[number-1] * arr[0]);
		
	}
}
