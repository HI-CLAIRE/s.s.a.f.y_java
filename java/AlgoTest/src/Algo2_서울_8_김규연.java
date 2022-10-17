import java.util.Arrays;
import java.util.Scanner;

public class Algo2_서울_8_김규연 {
	
	static int[] a1 = {1, 3, 5, 7};
	static int[] a2 = {2, 4, 6, 7};
	static int[][] arr;
	static int L;
	static int ans = Integer.MIN_VALUE;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			L = sc.nextInt();
			
			arr = new int[L][7];
			
			for(int i=0; i<L; i++) {
				for(int j=0; j<7; j++) {
					arr[i][j] = sc.nextInt();
				}
				Arrays.sort(arr[i]);
			}
			
			// 도미솔시 -> 1 3 5 7
			// 레파라시 -> 2 4 6 7
			
			// 9 == 2(레) / 8 == 1(도)
			
			// 가장 높은 점수를 출력해야 하므로 뒤에서부터 앞으로 접근한다.
			// 마지막 인덱스(6,k) 에서부터 접근해서 DFS로 탐색한다.
			// 화음에 맞다면 tmp에 더하고 화음에 맞지 않다면 다시 돌아가서 다음노드(k-1)가 유망한지 탐색 진행
			// 모든 노드를 다 탐색하였으면 탐색 종료 (k == 0 일때)
			// 빠져 나오기 전에 tmp 값과 ans 값을 비교해서 가장 큰 값을 저장
			// 다음 노드 확인
			
			for(int i=0; i<L; i++) {
				for(int j=0; j<7; j++) {
					dfs(6);
				}
			}
		}

	}

	private static void dfs(int k) {
		if(k == 0) {
			
			return;
		}
		
	}

}
