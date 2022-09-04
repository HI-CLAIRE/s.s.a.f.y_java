package G5;

import java.util.Scanner;

public class 치킨배달_15686 {

	static int distance(int[][] map, int y, int x) {
		// 북 동 남 서 
		int[] dx = {0, 1, 0, -1};
		int[] dy = {-1, 0, 1, 0};
		int ans = 0;
		
		
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] map = new int[N][N];
		
		for(int y=0; y<N; y++) {
			for(int x=0; x<N; x++) {
				map[y][x] = sc.nextInt();
			}
		}
		
		int cnt = 0;
		
		for(int j=0; j<N; j++) {
			for(int i=0; i<N; i++) {
				if(map[j][i] == 1) {
					
				}
			}
		}

		
	}

}
