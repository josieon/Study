package baekjoon;
import java.io.*;
public class N2751_MergeSort {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		MergeSort(arr, 0, N-1);
		for(int i = 0; i < N; i++) {
			bw.write(Integer.toString(arr[i]) + '\n');
		}
		bw.flush();
	}
	
	public static void Merge(int[] arr, int start, int end, int mid) {
		int[] temp = new int[end - start + 1];
		int idx_tmp = 0;
		int i = start;	//0
		int j = mid + 1;	//1
		int copy = 0;
		while(i <= mid && j <= end) {
			if(arr[i] < arr[j])
				temp[idx_tmp++] = arr[i++];
			else if(arr[i] > arr[j])
				temp[idx_tmp++] = arr[j++];
		}
		while(i <= mid)
			temp[idx_tmp++] = arr[i++];
		while(j <= end)
			temp[idx_tmp++] = arr[j++];
		for(int k = start; k<=end; k++) {
			arr[k] = temp[copy++];
		}
		
	}
	
	public static void MergeSort(int[] arr, int start, int end) {
		if(start < end) {
			int mid = (start + end) / 2;
			MergeSort(arr, start, mid);
			MergeSort(arr, mid + 1, end);
			Merge(arr, start, end, mid);
		}
	}

}
