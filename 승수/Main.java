//������ �ű�ٴ� ������ ���ߴ�. ������ �ű�� �ڵ������� ������ ���� ��ǥ�� ��ִ��� �˼��ִ�(�ߺ��� ���ϱ� ���ؼ��� �߰����� ��ġ �ʿ�)
//������ �Ѵ��� ������ �ű�� ���� ���� �ִ� �����̴�.
//������ HashMap�� ����ؼ� �Ű�����
package training;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		
		int[] origin = new int[number]; //���� ��ǥ�� �Է¹��� ��ǥ
		int[] sorted = new int[number]; //��ǥ�� ������������ �����ϱ� ���� �迭
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<number;i++)
		{
			origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(sorted);
		HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>(); //��ŷ�� �ű�� ���� HashMap
		
		int rank = 0;
		for(int a : sorted) //���� �̹� HashMap�� ����ִ� ��ǥ�̸� ���� ����
		{
			if(!rankMap.containsKey(a))
			{
				rankMap.put(a, rank);
				rank++;
			}
		}
		StringBuilder sb = new StringBuilder(); //StringBuilder�� ó������ �ѹ� ����غ� 
		for(int key : origin) {					//System.out�� ���� ȣ���Ҽ� �־ �ƹ��ʵ� for���� ����ϴ� �ͺ��� �ð��� ������ ����
			int ranking = rankMap.get(key);
			sb.append(ranking).append(' ');
		}
		System.out.println(sb);
	}
}

