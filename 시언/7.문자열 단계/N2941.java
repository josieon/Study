package baekjoon;
import java.io.*;
public class N2941 {
<<<<<<< HEAD

=======
>>>>>>> 9f7e77be81303c3249b13498056262664453f4a8
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cnt = 0;
		for(int i=0; i<str.length(); i++) {
			if(i<str.length()-1 && str.charAt(i)=='c') {
				if(str.charAt(i+1)=='=' || str.charAt(i+1)=='-')
					i++;
			}
			else if(i<str.length()-1 && str.charAt(i)=='d') {
				if(str.charAt(i+1)=='-')
					i++;
				else if(i<str.length()-2 && str.charAt(i+1)=='z')
					if(str.charAt(i+2)=='=')
						i+=2;
			}
			else if(i<str.length()-1 && (str.charAt(i)=='l' || str.charAt(i)=='n')) {
				if(str.charAt(i+1)=='j')
					i++;
			}
			else if(i<str.length()-1 && str.charAt(i)=='s') {
				if(str.charAt(i+1)=='=')
					i++;
			}
			else if(i<str.length()-1 && str.charAt(i)=='z') {
				if(str.charAt(i+1)=='=')
					i++;
			}
			cnt++;
		}
		System.out.println(cnt);
	}
<<<<<<< HEAD

}
=======
}
// �� ������ Ǯ�鼭 2���� StringIndexOutOfBounds ������ 5���� ������ ���Դ�.
// �׽�Ʈ ���̽� �� �˰����� ���� �״�� ¥�� �� �ǰ� �������� ���� ���� ���ܰ� �־��� �� ����.
// ó������ String�� char �迭�� �ٲپ ������ �׷� �ʿ� ���� charAt �Լ��� ȣ���ϸ� �Ǵ� ��������.
>>>>>>> 9f7e77be81303c3249b13498056262664453f4a8
