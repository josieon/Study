import java.util.Scanner;

public class Problem2089{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int input = sc.nextInt();
		
		if(input ==0)
		{
			System.out.println(0);
		}
		else {
			while(input != 1){
				sb.append(Math.abs(input % -2));
				input = (int)Math.ceil((double)input / (-2));
			}
		}
		System.out.println(sb.reverse().toString());
		
	}
}