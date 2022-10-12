package IM대비SWEA;

import java.util.Scanner;

public class 전기버스2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int K = sc.nextInt(); // 충전하면 갈 수 있는 거리 
			int N = sc.nextInt(); // 정류장 수  
			int M = sc.nextInt(); // 충전기가 있는 정류장 번호
			
			boolean[] chargers = new boolean[N];
			
			for(int i=0; i<M; i++) chargers[sc.nextInt()] = true;
			
			int ans = 0;
			for(int n=0; n<K; n++) {
				int i = 1, next = 0, start = n;
				while(true) {
					
					if(next >= N) {
						ans = Math.max(ans, i);
						System.out.println(i);
						break;
					}
					
					next = start + (K * i);
					
					
					i++;
				}	
				System.out.println("-----------------");
			}
			System.out.println(ans);
		}

	}

}
