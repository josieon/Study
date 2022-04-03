import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1463 {
	static int[] answer = new int[1000001];
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		System.out.println(function(number));
		
	}
	public static int function(int number)
	{
		if(number == 1)
			return answer[1] = 0;
		boolean flag1 = false;
		boolean flag2 = false;
		if(number % 3 == 0)
			flag1 = true;
		if(number %2 == 0)
			flag2 = true;
		if(flag1 == true && flag2 == false)
		{
			if(answer[number-1] == 0)
				return answer[number] = Math.min(function(number/3), function(number-1)) +1;
			else
			{
				return answer[number] = Math.min(answer[number/3], function(number-1)) +1;
			}
		}
		else if(flag1 == false && flag2 == true)
		{
			if(answer[number-1] == 0)
				return answer[number] = Math.min(function(number/2), function(number-1)) +1;
			else
			{
				return answer[number] = Math.min(answer[number/2], function(number-1)) +1;
			}
		}
		else if(flag1 == true && flag2 == true)
		{
			if(answer[number-1] == 0)
			{
				int a = Math.min(function(number/2), function(number-1)) + 1;
				return answer[number] = Math.min(a, function(number/3)+1);
			}
			else
			{
				int a = Math.min(answer[number/2], answer[number-1]);
				return answer[number] = Math.min(a, answer[number/3]) +1;
			}
		}
		else
		{
			if(answer[number] == 0)
			{
				return answer[number] = function(number-1)+1;
			}
			else
			{
				return answer[number] = answer[number-1] +1;
			}
		}
	}
}
