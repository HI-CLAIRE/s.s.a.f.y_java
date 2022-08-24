package BOJ;

import java.util.Scanner;

public class 배열돌리기1_16926 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		int R = sc.nextInt();
		
		int[][] map = new int[M][N];
		
		for(int i=0; i<M; i++)
			for(int j=0; j<N; j++)
				map[i][j] = sc.nextInt();
		
		// 땡겨줄거니까 방향이 반대로 되야함.
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
		// 위에거 수정 필요.
		
		int layer = 0;
		int x=0, y=0, d=0;
		
		for(int m=M, n=N; m/2>0 || n/2>0; m--, n--, layer++) {
			x = layer; y = layer;
			while(R-- > 0) {
				int tmp = map[layer][layer]; // 처음거 저장하고 마지막원소 땡겨서 덮어쓰기 
				while(true) {
					int nx = x + dx[d];
					int ny = y + dy[d];
					
					if(ny>=m || nx>=n || ny<layer || nx<layer) {
						d = (d+1) % 4;
						continue;
					}
					// 땡겨주기.
					
					x = nx; y = ny;
					
					
					// 탈출조건.
					if(nx == layer && ny == layer) break;
				}
				
			}
		}
		
		// 출력.
		
		
	}

}
