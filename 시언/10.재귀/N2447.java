package baekjoon;
import java.io.*;
public class N2447 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				f(i,j);
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
	
	public static void f(int x, int y) throws Exception{
		if(x<3 && y<3) {
			if(x % 3 == 1 && y % 3 == 1) {
				bw.write(" ");
			}
			else {
				bw.write("*");
			}
		}
		else {
			if(x % 3 == 1 && y % 3 == 1) {
				bw.write(" ");
			}
			else {
				f(x/3, y/3);
			}
		}
	}
}
// 본 문제는 풀지 못했다. 처음에 구조와 규칙을 파악하기 위해 반복문으로 구현을 하였다. 이 때 제대로 나왔다.
// 재귀함수를 사용하는 방법을 계속 고민을 하다가 StringBuilder나 BufferedWriter에 재귀 형식으로 함수를 구현해 출력을 하자니 개행 문자가 들어가야 할 부분에 대해 방법이 떠오르지 않았다.
// 결국엔 검색을 하였고, 문제를 못 푼 대신 다른 사람들이 푼 방법에 대해 고찰해보기로 했다.
// -----------첫번째 방법(이차원 String배열)---------------420ms
// 처음에 배열에 만들어 준 다음 모든 요소를 공백으로 초기화시켜준다.
// 배열과 startX, startY, 크기를 인자로 가지는 재귀 함수이다. N이 1일 때는 [x,y] 요소를 *로 만들어준다.(base case)
// 반복문을 통해 x+i*N/3, y+j*N/3, N/3 을 인자로 가지는 함수를 호출해준다.(general case)
// -----------두번째 방법(이차원 char배열)-----------------280ms
// 여기서는 재귀 함수가 x, y, N, blank라는 인자를 가지는 함수이다. blank인자는 boolean타입으로 공백칸인지를 나타낸다.
// 공백칸일 경우에는 반복문을 통해 x부터 x+N까지, y부터 y+N까지 배열의 값을 공백으로 만들어준다.
// N이 1일 경우에는 [x,y]를 *로 만들어준다.(base case)
// 반복문을 통해 x부터 x+N까지, y부터 y+N까지 star(i,j,N/3,false)함수를 호출해주고 다섯번째 반복문일때가 공백칸이므로 이 때 true를 가지는 star를 호출해준다.
// -----------세번째 방법(배열 사용 X)--------------------496ms
// 이 방법이 내가 풀고 싶었던 방식이다.
// x, y만 인자로 가지는 재귀함수이다. x,y가 3보다 작을 경우에는 x, y 값이 가운데 값일 경우에만 공백을 출력하고 나머지는 별을 출력한다.(base case)
// x, y가 3보다 큰 경우에는 x % 3 == 1 && y % 3 == 1인 경우에는 공백을 출력하고, 나머지 경우에는 x/3, y/3을 인자로 가지는 함수를 호출한다.
// main에서 N x N번만큼 이중반복문을 통해 함수를 호출하고 안쪽 반복문이 다 돌면 개행문자를 출력하도록 한다.
// -------------------------------------------------
// 내가 풀고 싶었던 방법이 시간이 가장 오래 걸린걸로 봐서 애초에 접근 자체도 생각을 잘못 했다 싶다.
// StringBuilder와 BufferedWriter의 비교에서도 그랬지만 버퍼에다 쓰는 것 보다는 변수자체로의 접근이 빠르기 때문에
// 위처럼 배열을 선언해서 써주는 게 버퍼에 바로 쓰는 것보다 빠른 결과가 나오지 않나 싶다.
// 1번과 2번 모두 배열을 사용하여 풀었지만 시간차이가 큰 이유는 2번에서는 blank라는 boolean파라미터를 통해 반복문을 돌지 않고 함수를 return하는 반면에
// 1번에서는 애초에 " "문자로 초기화해주고 모든 요소에 대해 반복문을 도는것이 원인이라고 생각한다.