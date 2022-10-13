package IM대비SWEA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 전기버스_윤식 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int K = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			// N개의 정류장
			int arr[] = new int[N + 1];

			st = new StringTokenizer(br.readLine());
			// 충전소가 있는 idx에 1이 들어감
			for (int i = 0; i < M; i++) {
				arr[Integer.parseInt(st.nextToken())] = 1;
			}
			
			// 끝나는거 판단용 부린
			boolean finished = true;
			// 0번부터 출발
			int charge_cnt = 0;
			int curidx = 0;
			
			whileloop : while (finished) {
				// K가 3이라 치면 1부터 3까지의 정류장을 조사해서
				// 가장 먼곳에 있는 충전소 있는 정류장을 찾음
				int lastchargeSt = -1;
				for (int i = curidx + 1; i <= curidx + K; i++) {
					// N에 도착하면 끝
					if (i == N) {
						// 그냥 빠져나오면 finished는 true 상태로 빠져나옴
						break whileloop;
					}
					if (arr[i] == 1) {
						lastchargeSt = i;
					}
				}
				// 충전소를 찾았으면 lastchargeSt는 -1이 아닐것
				if (lastchargeSt != -1) {
					// 충전 한번 시켜주고
					charge_cnt++;
					// 충전소에서 다시 출발한다 생각
					curidx = lastchargeSt;
				} else {
					finished = false;
				}
			}
			
			// 찾았으면
			if(finished) {
				bw.write("#"+tc+" "+charge_cnt+"\n");
			} else {
			// 못찾았으면
				bw.write("#"+tc+" 0\n");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
