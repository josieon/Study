import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Problem10757_2 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String str1 = st.nextToken();
		String str2 = st.nextToken(); //먼저 배열에 숫자를 저장하자
		
		int max_length = Math.max(str1.length(), str2.length());
		int[]A = new int[max_length+1];
		int[]B = new int[max_length+1]; //두 숫자중 더긴거를 max로 잡고 이보다 1크게 int배열선언(1크게 하는이유는 두개 더했을때 자리수가 늘어날수 있음
		
		for(int i=str1.length()-1, idx=0;i>=0;i--, idx++) // 숫자를 거구로 넣기!! 이게 바르게 넣는것보다 훨씬 편함
		{
			A[idx] = str1.charAt(i) - '0';
			B[idx] = str2.charAt(i) - '0';
		}
		
		for(int i=0;i<max_length;i++)//덧셈 진행
		{
			int value = A[i] +B[i];
			A[i] = value%10;
			A[i + 1] += value/10;
		}
		
		StringBuilder sb = new StringBuilder();
		if(A[max_length] != 0) { //여기서 if문을 쓴이유 맨앞지리수가 0인경우에는 0을 붙이는게 이상함
			sb.append(A[max_length]);
		}
		for(int i = max_length-1; i>=0;i--)
		{
			sb.append(A[i]);
		}
		System.out.println(sb);
	}
}
