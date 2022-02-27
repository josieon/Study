package baekjoon;
import java.io.*;
import java.lang.Math;
public class N9020 {
	public static boolean[] prime = new boolean[10001];
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		get_prime();
		for(int i=0; i<T; i++) {
			int n = Integer.parseInt(br.readLine());
			for(int j=n/2; j>1; j--) {
				if(!prime[j] && !prime[n-j]) {
					bw.write(Integer.toString(j) + " " + Integer.toString(n-j) + "\n");
					break;
				}
			}
		}
		bw.flush();
	}
	public static void get_prime() {
		prime[0] = prime[1] = true;
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i])
				continue;
			for(int j=i*i; j<prime.length; j+=i)
				prime[j] = true;
		}
	}
}
// 앞선 문제를 풀 때와 마찬가지로 입력의 개수가 다수이기 때문에 에라토스테네스의 채를 이용하는 것이 효율적이므로 이를 이용해 풀었다.
// 값이 입력되면 그 값의 절반값부터 값을 줄여가며 배열을 참조한다. 두 소수의 차이가 가장 적은 경우를 출력하기에 위와 같은 참조방법을 선택했다.
// 위와 같이 풀었을 때 236ms의 실행시간이 소요되었다.
// 다른 사람의 문제풀이를 찾아보았을 때 StringBuilder를 이용해 출력하는 것이 더 시간이 빨랐다.
// StringBuilder와 BufferedWriter의 차이점을 간략하게 설명하자면
// StringBuilder는 가변적인 String이다. 즉 메인 메모리에 있는 String변수의 값을 추가, 삭제, 수정 등 변경한다고 보면 된다. 이를 마지막에 출력장치로 출력을 한번에 해준다.
// BufferedWriter는 출력버퍼스트림에 값을 추가해준다. 한계점은 버퍼의 크기가 가득차면 초과된만큼 flush가 되어버린다. 혹은 flush함수를 호출해 버퍼의 내용을 출력장치로 한번에 해준다.
// 아직 운영체제를 깊게 공부하지는 않아서 출력버퍼스트림에 값을 추가하는 것과 메인메모리값을 로드하는 것의 효율성 등의 차이점에 대해서는 잘 알지 못하여서 이 정도만 알고 넘어간다.
// 결론은 메인 메모리에 저장된 변수의 값을 바꾸다가 한번에 출력하는 것이 버퍼에 저장된 값을 바꾸다가 한번에 출력하는 것보다 빠르다는 것이다.