package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N1085 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		int min = x;
		if(y < min)
			min = y;
		if(w-x < min)
			min = w-x;
		if(h-y < min)
			min = h-y;
		System.out.println(min);
	}
}
// �ҿ�ð� 5��, �ʹ� ���� ������ �� �Ǿ��ߴ�.
// if������ Ǯ���µ� �ٸ� ������� ��� Ǯ������ �ñ��ؼ� ���Ҵ��� if�� �ƴϸ� Math.min�� ����Ͽ���.