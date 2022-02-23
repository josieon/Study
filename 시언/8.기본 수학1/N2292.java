package baekjoon;
import java.io.*;
public class N2292 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<100000; i++) {
			if(N==1) {
			 	System.out.println(1);
				break;
			}
			long dur = 6 * (i+1);
			long start = 6 * i * (i+1) / 2 + 2;
			long end = start + dur - 1;
			if(start<=N && N<=end) {
				System.out.println(i+2);
				break;
			}
		}
	}
}
//본 문제는 위와 같이 풀었는데 아래와 같이 푸는 것이 훨씬 직관적인 것 같다. 실행시간은 똑같다.
//나는 범위를 최소값~최대값의 두 값을 계속 초기화시키면서 반복문을 돌리는데 최소값만 가지고 반복문만 돌려도 될 것 같다.
/*public class N2292 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 1;
		int range = 2;
		if(N == 1)
			System.out.println(1);
		else {
			while(range <= N) {
				range = range + count*6;
				count++;
			}
			System.out.println(count);
		}
	}
}*/