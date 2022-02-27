package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N10250 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int n = N / H + 1;
			int h = N % H;
			if(N % H == 0) {
				h = H;
				n = N / H;
			}
			bw.write(h+padLeftZeros(Integer.toString(n),2)+"\n");
		}
		bw.flush();
	}
	
	public static String padLeftZeros(String inputString, int length) {
		if(inputString.length() >= length) {
			return inputString;
		}
		StringBuilder sb = new StringBuilder();
		while(sb.length() < length - inputString.length()) {
			sb.append('0');
		}
		sb.append(inputString);
		return sb.toString();
	}
}
//int를 String으로 변환하는 게 생각이 안 나서 검색을 하여 본 문제를 풀었다.
//String으로 출력을 하려다 보니 호수에 0을 추가하는 것도 추가적으로 코드를 찾아보고 풀었다. 이를 패딩이라고 한다.
//그렇게 풀고나서 제출을 하니 오답 처리가 되었다. 왜 오답처리가 되는지 생각해보아도 떠오르지 않아서 검색을 해보았다.
//N이 H의 배수일때의 경우를 예외처리를 해주지 않아서 그랬다. 예를 들어, N이 12인데 H가 6이라면 기존의 알고리즘대로라면 003호가 나오게된다. 이러한 경우를 예외처리 해주었다.
//다 풀고 다른 사람이 푼 것을 보았는데 String으로 출력하지 않고 그냥 n과 h를 구한 다음 h*100+n을 출력해준다. 이렇게 하면 0을 패딩해 줄 필요도 없다.
//기존의 시간은 168ms 다른 사람처럼 푼 시간은 160ms였다.