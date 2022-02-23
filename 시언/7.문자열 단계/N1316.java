package baekjoon;
import java.io.*;
public class N1316 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt=0;
		for(int i=0; i<N; i++) {
			if(checker(br.readLine()))
				cnt++;
		}
		System.out.println(cnt);
	}
	public static boolean checker(String str) {
		int[] idx = new int[26];
		String arr=new String();
		for(int i=0; i<str.length(); i++) {	//문자열을 압축하는 반복문
			if(i==0)
				arr = arr + str.charAt(i);
			else {
				if(str.charAt(i) != arr.charAt(arr.length()-1))
					arr = arr + str.charAt(i);
			}
		}
		for(int i=0; i<arr.length(); i++) {	//압축된 문자열을 참조해 그룹 단어인지 여부 판별
			if(idx[(int)arr.charAt(i)-97]==0)
				idx[(int)arr.charAt(i)-97]=1;
			else
				return false;
		}
		return true;
	}

}
//위와 같이 푼 게 내가 푼 방식이고 검색을 해보니 문자열을 압축할 필요없이 if문을 사용해 previous 문자와 현재 문자를 가지고 할 수 있다.
//prev과 now가 다르다면 배열의 값을 참조해 true false를 판별 가능. prev과 now가 같다면 loop continue
