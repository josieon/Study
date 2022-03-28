import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Comparator;
public class N10814 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		People[] arr = new People[N];
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			arr[i] = new People(i, age, st.nextToken());
		}
		Arrays.sort(arr, new Comparator<People>() {
			@Override
			public int compare(People e1, People e2) {
				if(e1.getAge() == e2.getAge())
					return e1.getNum() - e2.getNum();
				else
					return e1.getAge() - e2.getAge();
			}
		});
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(arr[i].getAge()).append(' '+arr[i].getName() + '\n');
		}
		System.out.println(sb);
	}

}

class People{
	private int age;
	private int num;
	private String name;
	
	public People(int num, int age, String name) {
		this.num = num;
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getNum() {
		return this.num;
	}
	
	public String getName() {
		return this.name;
	}
}

// 클래스를 정의해서 풀어본 첫 문제인거 같다.
// 이전의 compare 함수 override를 사용해 푸는 문제라 크게 어렵지 않았으나 객체의 배열에 있어서 생성하고 초기화 하는 방법에 대해
// 다시 한번 짚을 수 있는 계기가 되어서 좋았다.