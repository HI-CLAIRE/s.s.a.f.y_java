package 과제제출;

import java.util.Scanner;

public class hw3_2 {
	public static int findMax(int[][] map, int i, int j, int N) {
		int max = 0;
		int rMax = 0;
		int lMax = 0;
		//탐색 시작 
		for(; i<N; i++) {
			for(; j<N; j++) {
				int len = 1;                               //11 붙어 있어도 다리 길이는 1이므로
//				while(j+len > N) {
					if(map[i][j] == 1 && map[i][j+len] == 0) { //오른쪽 탐색
						len++;
						if(map[i][j+len] == 1) {               //탐색 종료
							max = len;
							rMax = Math.max(max, len);
						}
					}
//				}
				len = 1;
//				while (i+len > N) {
					if(map[i][j] == 1 && map[i+len][j] == 0) { //아랫쪽 탐색 
						len++;
						if(map[i+len][j] == 1) {               //탐색 종료 
							max = len;
							lMax = Math.max(max, len);
						}
					}
//				}
				if(i+len >= N || i+len < 0) continue;
					if(j+len >= N || j+len < 0) continue;
			}
		}
		return Math.max(lMax, rMax);
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] map = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		int max = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				max = findMax(map, i, j, N);
			}
		}
		System.out.println(max);
		sc.close();
	}

}
