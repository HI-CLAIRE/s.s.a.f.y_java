package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 오목_2615 {

	static int[][] map = new int[19][19];
	static int[] dx = {1, 1, 0, -1}; // 시계반대방향 
	static int[] dy = {0, 1, 1, 1};
	public static void main(String[] args) throws IOException {
		
		// 입력 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<19; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());			
			for(int j=0; j<19; j++)
				map[i][j] = Integer.parseInt(st.nextToken());
		}
		
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				if(map[i][j] != 0) {
					for(int d=0; d<4; d++) {
						if(isomoq(i, j, d, map[i][j], 0)) {
							System.out.println(map[i][j]);
							System.out.print((i+1) + " " + (j+1));
							return;
						}
					}
				}
			}
		}
		System.out.println(0);
	}
	
	//오목인지 확인 
	static boolean isomoq(int x, int y, int d, int color, int cnt) {
		int nx = x + dx[d];
		int ny = y + dy[d];
		if(cnt == 4)
			return true;
		
		if(map[nx][ny] == color && isomoq(nx, ny, d, color, cnt + 1)) {
			return true;
		}
		
		if(nx>=19 || ny>=19 || nx<0 || ny<0)
			return false;
		
		return false;
	}
}
