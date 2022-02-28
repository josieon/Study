//순위를 매긴다는 생각을 못했다. 순위를 매기면 자동적으로 나보다 작은 좌표가 몇개있는지 알수있다(중복을 제하기 위해서는 추가적인 장치 필요)
//정렬을 한다음 순위를 매기면 쉽게 풒수 있는 문제이다.
//순위는 HashMap을 사용해서 매겨주자
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
		
		int[] origin = new int[number]; //먼저 좌표를 입력받을 좌표
		int[] sorted = new int[number]; //좌표를 오름차순으로 정렬하기 위한 배열
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<number;i++)
		{
			origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(sorted);
		HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>(); //랭킹을 매기기 위한 HashMap
		
		int rank = 0;
		for(int a : sorted) //만약 이미 HashMap에 담겨있는 좌표이면 담지 말자
		{
			if(!rankMap.containsKey(a))
			{
				rankMap.put(a, rank);
				rank++;
			}
		}
		StringBuilder sb = new StringBuilder(); //StringBuilder는 처음봐서 한번 사용해봄 
		for(int key : origin) {					//System.out을 적게 호출할수 있어서 아무례도 for문을 사용하는 것보다 시간이 빠를거 같음
			int ranking = rankMap.get(key);
			sb.append(ranking).append(' ');
		}
		System.out.println(sb);
	}
}

