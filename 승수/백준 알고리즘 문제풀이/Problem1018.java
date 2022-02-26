import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Problem1018{
	public static boolean[][] chess;
	public static int min =64;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		String str = new String();
		
		chess = new boolean[w][h];
		for(int i=0;i<w;i++)
		{
			str = br.readLine();
			for(int j=0;j<h;j++)
			{
				if(str.charAt(j) == 'W')
					chess[i][j] = true;
				else
					chess[i][j] = false;
			}
		}
		
		int x = w-8;
		int y = h-8;
		
		for(int i=0;i<=x;i++)
		{
			for(int j=0;j<=y;j++)
			{
				find(i,j);
			}
		}
		System.out.println(min);
	}
	public static void find(int i, int j)
	{
		int count =0;
		boolean Judge = chess[i][j];
		for(int m = i; m<i+8;m++)
		{
			for(int n = j; n<j+8; n++)
			{
				if(Judge != chess[m][n])
				{
					count++;
				}
				Judge =!Judge;
			}
			Judge = !Judge;
		}
		count = Math.min(count, 64-count);
		if(count<min)
			min = count;
	}
}