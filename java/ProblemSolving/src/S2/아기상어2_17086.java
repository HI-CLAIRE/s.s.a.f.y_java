package S2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 아기상어2_17086 {

	public static class Water {
		int r;
		int c;
		int cnt;
		
		public Water(int r, int c, int cnt) {
			super();
			this.r = r;
			this.c = c;
			this.cnt = cnt;
		}
		
	}
	
	static int[] dr = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int[] dc = {0, 1, 1, 1, 0, -1, -1, -1};
	static int[][] map;
	static boolean[][] visited;
	static int N, M, max;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		map = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		max = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(!visited[i][j] && map[i][j] == 0) {
					bfs(i, j);

				}
			}
		}
		System.out.println(max);
		sc.close();
	}

	private static void bfs(int i, int j) {
		Queue<Water> q = new LinkedList<>();
		
		visited[i][j] = true;
		q.offer(new Water(i, j, 0));
		
		while(!q.isEmpty()) {
			Water current = q.poll();
			int r = current.r;
			int c = current.c;
			int cnt = current.cnt;
			
			for(int d=0; d<8; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				
				if(nr>=0 && nr<=N-1 && nc>=0 && nc<=M-1 && !visited[nr][nc]) {
					visited[nr][nc] = true;
					q.offer(new Water(nr, nc, cnt+1));
					if(map[nr][nc] == 1) {
						max = Math.max(cnt, max);
						return;
					}
					
				}
			}
		}
		
	}

}
