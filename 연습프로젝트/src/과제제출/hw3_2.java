package 과제제출;

import java.util.Scanner;

public class hw3_2 {
	public static int findMax(int[][] map, int i, int j, int N) { //현재 좌표를 넘겨
		int max = 0;
		// 탐색 시작
		for (; i < N; i++) {
			for (; j < N; j++) {
				int len = 1; // 11 붙어 있어도 다리 길이는 1이므로
				if (map[i][j] == 1) { // 오른쪽 탐색
					while (j + len < N) {
						if (map[i][j + len] == 1) { // 탐색 종료 
							max = Math.max(max, len);
							break;
						}
						len++;
					}
				}
				len = 1;
				if (map[i][j] == 1) { // 아랫쪽 탐색
					while (i + len < N) {
						if (map[i + len][j] == 1) { // 탐색 종료
							max = Math.max(max, len);
							break;
						}
						len++;
					}
				}
			}
		}
		return max;

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
		int tmp = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				tmp = findMax(map, i, j, N);
				max = Math.max(max, tmp);
			}
		}
		System.out.println(max);
		sc.close();
	}

}
