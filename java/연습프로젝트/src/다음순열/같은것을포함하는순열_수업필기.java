package 다음순열;
import java.util.Arrays;

/*
 * 다음 순열 : 바로 큰 다음 순열을 구해서,,
 * 1 2 3 4
 * 1 2 4 3
 * 1 3 2 4
 * 1 3 4 2
 * 1 4 2 3
 * 1 4 3 2
 * . . .
 * 4 3 2 1
 * 
 * 1. 꼭대기(A) : 오른쪽에서 출발하여 가장 높은 곳
 * 2. 낭떠러지(B) : 꼭대기 왼쪽
 * 3. 낭떠러지보다 최초로 발견된 큰 수(C) : 오른쪽에서 출발 -> 꼭대기
 * 4. B와 C를 교환
 * 5. 가장 오른쪽 ~ 꼭대기 바로 전의 순서를 뒤집는다.
 */

public class 같은것을포함하는순열_수업필기 {

	// 오른쪽 끝에서부터 시작해서 현재좌표는 arr[i]
	// 오른쪽부터 시작하므로 비교하고 싶은 좌표는 arr[i-1]
	public static boolean nextPerm(int[] arr) {
		
		int A = 0, B = 0, C = 0, idx = 0;
		
		// A 랑 B 찾기
		for(int i=arr.length - 1; i>0; i--) {
			if(arr[i] > arr[i-1]) {
				A = arr[i];
				B = arr[i-1];
				idx = i;
			}
		}
		// B와 C교환하기
		for(int i=arr.length - 1; i>idx; i--) {
			if(arr[i] > A) {
				C = arr[i-1];
				int tmp = B;
				B = C;
				C = tmp;
			}
		}
		// 역순
		for(int i=idx; i<arr.length / 2; i++) {
			int tmp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = tmp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		
		while(nextPerm(arr));
		
		for(int a : arr)
			System.out.println(a + " ");
		

	}

}
