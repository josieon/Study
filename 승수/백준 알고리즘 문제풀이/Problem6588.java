import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Problem6588 {
	static int sosu[] = new int[10000001];
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		makeSosu();
		while(true)
		{
			int number = Integer.parseInt(br.readLine());
			int holsu1 = 3;
			int holsu2 = number-3;
			if(number == 0)
				break;
			if(number %2 == 1)
				System.out.println("Goldbach's conjecture is wrong.");
			else
			{
				while(true)
				{
					if(sosu[holsu1] != 0 && sosu[holsu2] != 0)
					{
						System.out.println(number+" = " +holsu1 +" + " + holsu2);
						break;
					}
					else
					{
						holsu1 = holsu1 + 2;
						holsu2 = holsu2 - 2;
					}
				}
			}
			
		}
	}
	public static void makeSosu()
	{
		for(int i=2;i<=1000000;i++)
		{
			sosu[i] = i;
		}
		for(int i=2;i<=1000000;i++)
		{
			if(sosu[i] == 0)
			{
				continue;
			}
			else
			{
				for(int j=i+i;j<=1000000;j+=i)
				{
					sosu[j] = 0;
				}
			}
		}
	}
}
