package S2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class 음식물피하기_1743 {

	static int N, M, K, max;
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = {0, 1, 0, -1};
	static boolean[][] map, visited;
	
	public static class Trash{
		int r;
		int c;
		public Trash(int r, int c) {
			super();
			this.r = r;
			this.c = c;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		
		map = new boolean[N][M];
		visited = new boolean[N][M];
		
		for(int k=0; k<K; k++) {
			map[sc.nextInt() - 1][sc.nextInt() - 1] = true;
		}
		
		max = 1;
		for(int r=0; r<N; r++) {
			for(int c=0; c<M; c++) {
				if(!visited[r][c] && map[r][c]) {
					bfs(r,c);
				}
			}
		}
		
		System.out.println(max);
	}

	private static void bfs(int R, int C) {
		int cnt = 1;
		
		Queue<Trash> q = new LinkedList<>();
		
		visited[R][C] = true;
		q.offer(new Trash(R, C));
		
		while(!q.isEmpty()) {
			Trash pos = q.poll();
			int r = pos.r;
			int c = pos.c;
			
			for(int d=0; d<4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				
				if(nr>=0 && nr <=N-1 && nc>=0 && nc<=M-1 && !visited[nr][nc] && map[nr][nc]) {
					visited[nr][nc] = true;
					cnt++;
					q.offer(new Trash(nr, nc));				
				}
			}
		}
		max = Math.max(cnt, max);
	}

}
