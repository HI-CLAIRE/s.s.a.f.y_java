package 모의SW역량테스트;

import java.util.Scanner;

public class 벽돌깨기_0929 {

	static int N, W, H;
	static int[][] map;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			N = sc.nextInt();
			W = sc.nextInt();
			H = sc.nextInt();
			map = new int[H][W];
			
			for(int r=0; r<H; r++) {
				for(int c=0; c<W; c++) {
					map[r][c] = sc.nextInt();
				}
			}
			
		}

	}

}
