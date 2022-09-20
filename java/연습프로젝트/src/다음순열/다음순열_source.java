package 다음순열;

import java.util.Arrays;

public class 다음순열_source {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		
		do {
			System.out.println(Arrays.toString(arr));
		} while(np(arr));
	}

	private static boolean np(int[] arr) {
		// 1. 꼭대기 찾기
		int i = arr.length - 1;
		while(i>0 && arr[i-1] >= arr[i])
			i--;
		
		// 1-1. 꼭대기가 0번 인덱스에 있는 경우
		if(i == 0)
			return false;
		
		// 2. 낭떠러지보다 큰 수 찾기
		int j = arr.length - 1;
		while(arr[i-1] >= arr[j])
			j--;
		
		// 3. B <-> C
		swap(arr, i-1, j);
		
		// 4. 역순 뒤집기
		int k = arr.length - 1;
		while(i < k)
			swap(arr, i++, k--);
		return true;
	}
	
	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
