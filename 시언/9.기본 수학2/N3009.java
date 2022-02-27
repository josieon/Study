package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class N3009 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr_x = new ArrayList<>();
		ArrayList<Integer> arr_y = new ArrayList<>();
		for(int i=0; i<3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			Object temp = Integer.parseInt(st.nextToken());
			if(arr_x.contains(temp))
				arr_x.remove(temp);
			else
				arr_x.add((int)temp);
			temp = Integer.parseInt(st.nextToken());
			if(arr_y.contains(temp))
				arr_y.remove(temp);
			else
				arr_y.add((int)temp);
		}
		System.out.println(arr_x.get(0)+" "+arr_y.get(0));
	}
}
// �ҿ�ð� : 40��
// ó������ int�迭�� ����� Ǯ���� �ϴٺ��� �˰����� ��� ¥������ ���� ���� �ȿͼ� �ð��� ���� ����ߴ�.
// �׷��ٰ� ������ �׳� ���������� �����ؼ� Ǯ���� �߰�, �� 3���� ��ǥ���� �����µ� x�� y���� 3�� �� 2���� ��ģ��. �� ��ġ�� ���� ������ ��ǥ�� ������ ���̹Ƿ� �׷��� Ǯ�� �ǰڴ� �����ߴ�.
// �׷��� �迭�� �����Ҵ��̰� �����ϴ� �Լ��� index�� ���� ������ �־ �������� �ڷᱸ����� �����߰�, �������� ������ ��ô� ArrayList��� �ڷᱸ���� ���ö� �˻��� �ؼ� ����ߴ�.
// �̹� ������ Ǯ�鼭 ArrayList��� �ڷᱸ���� ���� ����� ���θ� �ϰ� �Ѿ�߰ڴ�.
// �ٸ� ������� if else���� ���� �� ���� ���� ��ǥ���� �� ���ؼ� ������ ���� ã�Ҵ�. ����ӵ��� if else���� �� ������.