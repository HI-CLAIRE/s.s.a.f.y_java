package G5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토_7576 {

	static int M, N, min;
	static int[][] box;
	static boolean[][] visited;
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = {0, 1, 0, -1};
	static Queue<Tomato> q = new LinkedList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		M = sc.nextInt();
		N = sc.nextInt();
		
		box = new int[M][N];
		visited = new boolean[M][N];
		visited = new boolean[M][N];
		
		// -1인 칸은 갈 수 없으므로 방문처리를 한 후 들어가지 못하도록
		for(int r=0; r<M; r++) {
			for(int c=0; c<N; c++) {
				box[r][c] = sc.nextInt();
				if(box[r][c] == -1) {
					visited[r][c] = true;		
				}
				else if(box[r][c] == 1) {
					visited[r][c] = true;
					q.offer(new Tomato(r, c, 0));
				}
			}
		}
		
		// 1->0 가장 최소값을 찾기
		// 다 채우면 종료
		// 하나라도 방문하지 않은 창고가 있다면 -1 출력
		min = Integer.MAX_VALUE;
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(box[i][j] == 1 && !visited[i][j]) {
					bfs();					
				}
			}
		}
		System.out.println(min);
	}

	private static void bfs() {
		while(!q.isEmpty()) {
			Tomato pos = q.poll();
			int r = pos.r;
			int c = pos.c;
			int cnt = pos.cnt;
			
			// 사방탐색 진행
			for(int d=0; d<4; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];
				
				if(nr>=0 && nr<=M-1 && nc>=0 && nc<=N-1 && !visited[nr][nc] && box[nr][nc]==0) {
					visited[nr][nc] = true;
					box[nr][nc] = 1;
					q.offer(new Tomato(nr, nc, cnt+1));
				}
			}
			min = Math.min(min, cnt);
		}
		// 종료조건
		// 더 이상 방문할 상자가 없을 때
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(visited[i][j]) {
					min = -1;
					return;
				}
			}
		}
	}

	public static class Tomato {
		int r;
		int c;
		int cnt;
		public Tomato(int r, int c, int cnt) {
			super();
			this.r = r;
			this.c = c;
			this.cnt = cnt;
		}
		
	}
}
