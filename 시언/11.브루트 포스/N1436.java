package baekjoon;
import java.io.*;
public class N1436 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(Find(N));
	}
	
	public static int Find(int N) {
		int cnt = 0;
		int ans = 0;
		String s;
		while(true) {
			ans++;
            s = Integer.toString(ans);
            if(s.contains("666")){
                cnt++;
            }
            if(cnt == N)
                break;
		}
		return ans;
	}

}
// 소요시간: 10분 + 20분(검색하고 수정)
// 처음에는 Integer -> String -> char[] 한 다음, 반복문을 통해 문자를 하나씩 비교하여 풀고, 이를 배열에다 저장했다.
// 근데, OutOfIndexError가 발생했고, 이는 배열을 사용하여서 발생한 문제였다.
// 검색을 해보니 다른 사람들은 배열에다가 그냥 저장하지 않고 변수를 갱신하는 식으로 풀었다.
// 또한, Integer -> String하고 contains함수를 그냥 사용하면 되는 문제였다.
// 문제를 푸는 것이 중요한게 아니라 어떻게 푸는 것이 더 중요한 것 같다.
// 다른 사람들이 딱 봤을 때, 직관적으로 파악할 수 있도록 함수 사용이나 클린 코딩에 좀 더 신경써야겠다.