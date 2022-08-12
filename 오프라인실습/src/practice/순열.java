package practice;

public class 순열 {

	public static void main(String[] args) {
		// n개의 숫자 배열
		// n = arr.length
		int[] arr = {1, 2, 3, 4};
		int r = 3; // 뽑는 갯수
		boolean[] visited = new boolean[arr.length]; // 해당 숫자가 앞에서 뽑혔는지 check
		int[] out = new int[r]; // 봅은 각각의 경우를 저장할 배열
		
		rec(arr, visited, out, 0, r);
		
	}
	
	public static void rec(int[] arr, boolean[] visited, int[] out, int depth, int r) {
		//기저조건
		if(depth == r) {
			for(int i=0; i<out.length; i++) System.out.println(out[i]);
			System.out.println();
			return;
		}
		
		//유도파트
		for(int i=0; i<arr.length; i++) {
			if(!visited[i]) { //배열에서 i번째 원소를 뽑은 적이 없다면
				visited[i] = true; //i번째 원소를 뽑고
				out[depth] = arr[i]; //i번째 원소를 depth번째의 숫자로 뽑음(저장)
				rec(arr, visited, out, depth+1, r);
				visited[i] = false; //다시 초기화
			}
		}
	}
}
