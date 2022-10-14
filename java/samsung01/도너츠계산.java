package samsung01;

import java.util.Scanner;

public class 도너츠계산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[][] map = new int[1000][1000];
			
			// map input
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			// 최종정답 (시작좌표가 새로 바뀔 때마다 max값으로 갱신해주기
			int ans = 0;
			
			// 시작좌표를 for문을 돌리면서 뽑아주기 (r,c)
			for(int r=0; r<=N-K; r++) {
				for(int c=0; c<=N-K; c++) {
					
					// map을 순회하면서 시작좌표를 기준으로 K길이만큼 도너츠로 더해주기
					int tmp = 0;
				

					// 왼쪽
					// (0,0) (1,0) (2,0)
					for(int nr=r; nr<r+K; nr++) {
						tmp += map[nr][c];
						
					}
					
					// 위쪽
					// (0,0) (0,1) (0,2)
					for(int nc=c; nc<c+K; nc++) {
						tmp += map[r][nc];
					}
					
					// 오른쪽
					// (0,2) (1,2) (2,2)
					for(int nr=r; nr<r+K; nr++) {
						tmp += map[nr][c + K-1];
					}
					
					// 아래쪽
					// (2,0) (2,1) (2,2)
					for(int nc=c; nc<c+K; nc++) {
						tmp += map[r + K - 1][nc];
					}

					int edge = map[r][c] + map[r+K-1][c] + map[r][c+K-1] + map[r+K-1][c+K-1];
					tmp -= edge;
					
					ans = Math.max(ans, tmp);
				}
			}
			
			System.out.println("#" + tc + " " + ans);
			
		}
		
		
	}

}
