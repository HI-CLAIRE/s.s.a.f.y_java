package IM대비SWEA;

import java.util.Scanner;

public class 파동파동2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();	// 배열의 크기
			int[][] map = new int[N][N];
			
			int init = sc.nextInt();
			int r = sc.nextInt() - 1;
			int c = sc.nextInt() - 1;
			int D = sc.nextInt();
			
			map[r][c] = init;
			
			int i = 1, next = 0;
			while(true) {
				next = init + (D * i);
				if(next>=255) next = 255;
				
				if(next <= 0 || (r + i >= N && c + i >= N && r - i <0 && c - i < 0)) break;
				
				// i번째 테두리의 시작좌표 
				int nr = r - i;
				int nc = c - i;
				
				for(int j=0; j<2*i+1; j++) {
					if(nr+j>=0 && nr+j<N && nc>=0 && nc<N) map[nr + j][nc] = next;
					if(nc+j>=0 && nc+j<N && nr>=0 && nr<N) map[nr][nc + j] = next;
					if(r+i>=0 && r+i<N && nc+j>=0 && nc+j<N) map[r + i][nc + j] = next;
					if(c+i>=0 && c+i<N && nr+j>=0 && nr+j<N) map[nr + j][c + i] = next;
				}
				i++;
			}
//			printer(map, N);
			
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(tc).append(" ");
			for(int y=0; y<N; y++) {
				int sum = 0;
				for(int x=0; x<N; x++) {
					sum += map[y][x];
				}
				sb.append(sum).append(" ");
			}
			System.out.println(sb.toString());
		}

	}
//	public static void printer(int[][] map, int N) {
//		for(int i=0; i<N; i++) {
//			for(int j=0; j<N; j++) {
//				System.out.print(map[i][j] + "  ");
//			}
//			System.out.println();
//		}
//	}

}
