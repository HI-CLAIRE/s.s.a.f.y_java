package samsung01;

import java.util.Arrays;
import java.util.Scanner;

public class 나무의키 {

	static int[] tree;
	static int N;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			N = sc.nextInt();
			
			// 나무의 키가 저장된 배열
			tree = new int[N];
			boolean[] isOk = new boolean[N];
			
			for(int i=0; i<N; i++) {
				tree[i] = sc.nextInt();
			}
			
			boolean change = false;
			boolean isDone = true;
			int tree_cnt = 1;	// 한 개는 이미 다 자라있으므로
			int day = 1;
			int ans = Integer.MAX_VALUE;

			Arrays.sort(tree);
			
			int goal = tree[N-1];
			
			while(true) {
				
				// 위치조정 필요
//				if(day > ans) {
//					continue;
//				}
				
				if(tree_cnt == N) {
					ans = Math.min(ans, day);
					break;
				}

				for(int i=0; i<N; i++) {
					
				}
			}
		}
		
	}
	public static boolean isOdd(int n) {
		if(n % 2 == 0) return false;
		return true;
	}

	
}
