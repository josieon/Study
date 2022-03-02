package baekjoon;
import java.io.*;
import java.lang.Math;
public class N11729 {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		bw.write(Integer.toString((int)(Math.pow(2, N) - 1)));
		bw.write('\n');
		Hanoi(N, 1, 2, 3);
		bw.flush();
		bw.close();
	}
	
	public static void Hanoi(int N, int src, int tmp, int dst) throws Exception{
		if(N == 0)
			return;
		if(N == 1) {
			bw.write(src+ " " + dst + "\n");
			return;
		}
		else {
			Hanoi(N-1, src, dst, tmp);
			bw.write(src+ " " + dst + "\n");
			Hanoi(N-1, tmp, src, dst);
		}
	}
}
// 기존에 알고 있던 알고리즘이라 소요시간이 크게 걸리지 않았던 것으로 기억한다.
// 알고리즘 시간에 풀어보았던 방식을 떠올리며 규칙찾기를 했는데 규칙은 금방 찾았으나, 백준에 제출시 자꾸 틀렸다고 나와서 원인분석을 하였다.
// Hanoi함수를 호출할 때 else부분에 Hanoi(N-1) -> 제일 밑 블록 destination으로 옮기고 -> Hanoi(N-1) 이 general case이다.
// 기존에는 제일 밑 블록을 옮기는 과정을 Hanoi(1)로 함수를 호출해서 처리를 했었다. 이클립스IDE에서는 잘 되었는데, 백준 제출 시 틀렸다고 나와서 이 부분을 굳이
// 함수 호출을 한 번 더 하지 않고 그냥 옮기는 걸로 처리를 해버렸더니 정답처리가 되었다. 정확한 원인은 모르겠다.
