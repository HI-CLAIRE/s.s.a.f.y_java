package practice;

public class 조합 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		
		int r = 3;
		boolean[] selected = new boolean[arr.length];
		
		comb(arr, selected, 0, 0, r);

	}
	
	//start ~ 끝에 있는 원소 중에서 뽑을 수 있음
	//선택한 다음 , 다음 원소를 뽑으러 간다
	static void comb(int[] arr, boolean[] selected, int start, int depth, int r) {
		//기저 조건
		if(depth == r) {
			for(int i=0; i<arr.length; i++) {
				if(selected[i]) System.out.print(arr[i]);
			}
			System.out.println();
			return;
		}
		
		
		//유도 파트
		for(int i=start; i<arr.length; i++) {
			selected[i] = true;
			comb(arr, selected, i+1, depth+1, r);
			selected[i] = false;
	
		}
	}

}
