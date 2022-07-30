package 과제제출;

import java.util.Scanner;

public class hw3_2 {
	public static int findMax(int[][] map, int i, int j, int N) {
		int max = 0;
		
		
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] map = new int[N][N];
		for(int i=0;i<N;i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		int len = 0;
		int max = 0;
		for(int i=0; i<N; i++) {
			for(int j=0;j<N;j++) {
				if(map[i][j] == 1) {
					//오른쪽 탐색시작
					
					if(map[i][j+1] == 1)
						max = len;
				}
			}
		}

	}

}
