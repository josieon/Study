import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//아직 재귀에 메모이재이션을 섞는게 자연스럽지가 않음
//다이나믹 프로그래밍 문제
public class Problem11726 {
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] bank = new int[1001];
		int index = Integer.parseInt(br.readLine());
		System.out.println(tail(bank, index));
	}
	public static int tail(int[] bank, int index)
	{
		if(index == 1)
			return 1;
		if(index == 2)
			return 2;
		if(bank[index] != 0)
			return bank[index];
		return bank[index] = (tail(bank, index-1) +tail(bank, index-2))%10007;
	}
}
