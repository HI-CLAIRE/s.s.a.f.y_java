package SWEA;

import java.util.Scanner;

public class 요리사 {

	static int[][] map;
	static int N;
	static int[] f1;
	static int[] f2;
	
	// 식재료 두 개를 넘겨줬을 때 음식의 맛
	private static int synergy(int y, int x) {
		int s1 = map[y][x];
		int s2 = map[x][y];
		int ans = s1 + s2;
		return ans;
	}
	
	// 식재료 중복 없이 뽑기 (조합)
	// food1 과 food2 조합 배열 2개 필요
	private static void comb(boolean[] visited, int start, int r) {
		if(r == 0) {
			f1 = new int[N/2];
			f2 = new int[N/2];
			
			// i, j=f1, k=f2
			for(int i=0, j=0, k=0; i<N; i++) {
				if(visited[i]) 
					f1[j++] = i;
				else f2[k++] = i;
			}
			return;
		}
		for(int i=start; i<N; i++) {
			visited[i] = true;
			comb(visited, i+1, r-1);
			visited[i] = false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			map = new int[N][N];
			
			for(int j = 0; j<N; j++) {
				for(int i=0; i<N; i++) {
					map[j][i] = sc.nextInt();
				}
			}
			
			// 조합을 저장해뒀다가 for문을 돌리면서 food1과 food2의 맛의 차이 구하기
			

		}
	}

}
