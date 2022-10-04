package SWEA;

import java.util.Scanner;

public class 삼성시의버스노선 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			// 버스노선 저장 
			int[][] list = new int[N][2];
			for(int i=0; i<N; i++) {
				list[i][0] = sc.nextInt();
				list[i][1] = sc.nextInt();
			}
			
			int P = sc.nextInt();
			int[] cnt = new int[P];
			for(int i=0; i<P; i++) {
				int busStop = sc.nextInt();
				for(int j=0; j<N; j++) {
					// 버스정류장이 노선에 포함되면 +1
					if(list[j][0]<=busStop && busStop<=list[j][1])
						cnt[i] += 1;
				}
			}
			System.out.print("#" + tc);
			for(int i=0; i<P; i++)
				System.out.print(" " + cnt[i]);
			System.out.println();
		}
		sc.close();
	}

}
