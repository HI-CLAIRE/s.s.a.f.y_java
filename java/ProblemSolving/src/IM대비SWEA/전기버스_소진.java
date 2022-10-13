package IM대비SWEA;

import java.util.Scanner;

public class 전기버스_소진 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int K = sc.nextInt();
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			boolean[] map = new boolean[N+K];
			
			for(int i=0; i<M; i++) {
				map[sc.nextInt()] = true;
			}
			
			int idx = 0, stop = 0, ans =0;
			out : while(idx < N) {
				
				for(int i=idx; i<=idx+K; i++) {
					// i번째에 정류장이 있다면 i를 다음 시작지점으로 만들어주기
					if(map[i])
						stop = i;
					// i가 N을 넘으면 더이상 갈 수 있는 정류장이 없기 때문에 큰 while문 빠져나오기
					if(i>=N)
						break out;
				}
				
				// 중간에 정류장이 없었다면 idx는 여전히 0이므로 버스가 더이상 갈 수 없음
				if(stop == idx) {
					ans = 0;
					break;
				}
				
				// 무사히 반복문을 다 돌면 충전 횟수를 늘려준다.
				ans++;
				
				// idx를 다음 시작지점으로 만들어주기
				idx = stop;
			}
			System.out.println("#" + tc + " " + ans);
		}

	}

}
