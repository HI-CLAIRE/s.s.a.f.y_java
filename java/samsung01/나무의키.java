package samsung01;

import java.util.Arrays;
import java.util.Scanner;

public class ������Ű {

	static int[] tree;
	static int N;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			N = sc.nextInt();
			
			// ������ Ű�� ����� �迭
			tree = new int[N];
			boolean[] isOk = new boolean[N];
			
			for(int i=0; i<N; i++) {
				tree[i] = sc.nextInt();
			}
			
			boolean change = false;
			boolean isDone = true;
			int tree_cnt = 1;	// �� ���� �̹� �� �ڶ������Ƿ�
			int day = 1;
			int ans = Integer.MAX_VALUE;

			Arrays.sort(tree);
			
			int goal = tree[N-1];
			
			while(true) {
				
				// ��ġ���� �ʿ�
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
