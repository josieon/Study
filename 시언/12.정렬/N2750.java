package baekjoon;
import java.io.*;
public class N2750 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		SelectionSort(arr);
		for(int i = 0; i < arr.length; i++)
			bw.write(Integer.toString(arr[i]) + '\n');
		bw.flush();
	}
	
	public static void SelectionSort(int[] arr) {	// ���� ���� ���
		for(int i = 0; i<arr.length; i++) {
			int idx_min = i;
			for(int j = i + 1; j<arr.length; j++) {
				if(arr[idx_min] > arr[j])
					idx_min = j;
			}
			int tmp = arr[i];
			arr[i] = arr[idx_min];
			arr[idx_min] = tmp;
		}
	}
	
	public static void InsertionSort(int[] arr) {
		for(int i = 1; i<arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && key < arr[j]) {
				int tmp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = tmp;
			}
			arr[j+1] = key;
		}
	}
	
	public static void BubbleSort(int[] arr) {
		for(int i = 0; i<arr.length - 1; i++) {
			for(int j = 1; j<arr.length - 1; j++) {
				if(arr[j-1] > arr[j]) {
					int tmp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

}
// �ҿ�ð�: 5��
// ���� �˰����� �⺻ �˰��� �� �ϳ��̱⿡ �� ������ �Ѵ�. �켱 ���� ���� ������� Ǯ����. �̴� O(n^2)�̴�.
// ���Ŀ� ���� �����ϰ� ���� ���İ� ���� ������ �߰������� �����غ��Ҵ�.
