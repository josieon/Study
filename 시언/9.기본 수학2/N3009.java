package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class N3009 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr_x = new ArrayList<>();
		ArrayList<Integer> arr_y = new ArrayList<>();
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			Object temp = Integer.parseInt(st.nextToken());
			if(arr_x.contains(temp))
				arr_x.remove(temp);
			else
				arr_x.add((int)temp);
			temp = Integer.parseInt(st.nextToken());
			if(arr_y.contains(temp))
				arr_y.remove(temp);
			else
				arr_y.add((int)temp);
		}
		System.out.println(arr_x.get(0)+" "+arr_y.get(0));
	}
}
// 소요시간 : 40분
// 처음에는 int배열을 사용해 풀려고 하다보니 알고리즘을 어떻게 짜야할지 감이 오지 안와서 시간을 많이 허비했다.
// 그러다가 문제를 그냥 본질적으로 접근해서 풀고자 했고, 총 3개의 좌표값이 들어오는데 x나 y값이 3개 중 2개는 겹친다. 안 겹치는 값을 가지는 좌표가 마지막 점이므로 그렇게 풀면 되겠다 생각했다.
// 그러나 배열은 정적할당이고 지원하는 함수나 index의 접근 문제에 있어서 부적절한 자료구조라고 생각했고, 지난번에 가볍게 써봤던 ArrayList라는 자료구조가 떠올라서 검색을 해서 사용했다.
// 이번 문제를 풀면서 ArrayList라는 자료구조에 대해 제대로 공부를 하고 넘어가야겠다.
// 다른 사람들은 if else문을 통해 세 개의 점의 좌표값을 다 비교해서 마지막 점을 찾았다. 실행속도는 if else문이 더 빨랐다.