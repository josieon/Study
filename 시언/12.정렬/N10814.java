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

// Ŭ������ �����ؼ� Ǯ� ù �����ΰ� ����.
// ������ compare �Լ� override�� ����� Ǫ�� ������ ũ�� ����� �ʾ����� ��ü�� �迭�� �־ �����ϰ� �ʱ�ȭ �ϴ� ����� ����
// �ٽ� �ѹ� ¤�� �� �ִ� ��Ⱑ �Ǿ ���Ҵ�.