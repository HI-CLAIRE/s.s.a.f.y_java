package D4;

import java.util.Scanner;

public class 장훈이의높은선반_0922 {

	static boolean[] visited;
	static int[] heights;
	static int N;
	static int B;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			N = sc.nextInt();
			B = sc.nextInt();
			heights = new int[N];
			
			// 점원들의 키
			for(int i=0; i<N; i++)
				heights[i] = sc.nextInt();
			
			visited = new boolean[N];
			comb(0);

			System.out.printf("#%d %d\n", tc, min);
			min = Integer.MAX_VALUE;
		}
		sc.close();
	}
	
	static void comb(int depth) {
		if(depth == N) {
			int sum = 0;
			for(int i=0; i<N; i++) {
				if(visited[i]) {
					sum += heights[i];
				}
			}
			if(sum >= B) {
				int diff = sum - B;
				min = Math.min(min, diff);
			}	
			return;
		}
		visited[depth] = true;
		comb(depth + 1);
		visited[depth] = false;
		comb(depth + 1);
	}

}
