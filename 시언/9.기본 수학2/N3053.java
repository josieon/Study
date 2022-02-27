package baekjoon;
import java.io.*;
import java.lang.Math;
public class N3053 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine());
		System.out.println(String.format("%.6f", R*R*Math.PI));
		System.out.println(R*R*2);
	}

}
// 소요시간 : 5분
// 유클리드 기하학, 비유클리드 기하학, 택시 기하학 등 모르는 단어들이 나와서 검색해서 공부를 해야 하나 싶었는데
// 예제 입력과 예제 출력을 보고 원의 너비를 구하는 데 첫번째는 그냥 원의 넓이, 택시 기하학에서의 원의 넓이는 반지름제곱*2인것 같아서 그렇게 풀었더니
// 정답처리되었다.
// 그냥 이 문제는 오차허용범위내에서 출력을 어떻게 시키는지에 대해 묻는 문제같다는 생각이 든다.
// String.format 메소드를 이용해 풀어주었다.