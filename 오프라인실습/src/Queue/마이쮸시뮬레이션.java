package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class 마이쮸시뮬레이션 {
	public static void main(String[] args) {
		int N = 20;   // 마이쮸의 개수 
		int pNum = 1; // 사람의 번호
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {pNum, 1}); // {사람의 번호, 가져갈 마이쮸 개수}
		// p[0] : 사람의 번호
		// p[1] : 기져갈 마이쮸 개수
		
		while(N>0) { // 나눠줄 마이쮸가 남아있다면,
			while(!queue.isEmpty()) {   // 큐에 사람이 있다면,
				int[] p = queue.poll(); // 큐에서 사람을 뺀다.
				
				// p에게 마이쮸를 나눠주고
				// 만약 N==0 이라면 마지막 사람
				// 나눠줬는데도 N>) 이라면 줄을 세운다.
				N -= p[1];
				if(N <= 0) {
					System.out.println(p[0] + "이 마지막 마이쮸를 가져갔습니다.");
					break;
				} else { // N이 남아 있는 상황
					System.out.println(p[0] + "가 " + p[1] + "개의 마이쮸를 가져갔습니다."
							+ "남은 마이쮸의 수 : " + N);
					
					
					// 자기 자신을 먼저 줄 세우고(가져갈 마이쮸는 +1개)
					queue.offer(new int[] {p[0], p[1] + 1});
					
					// 새로운 사람을 줄 세운다. (가져갈 마이쮸는 1개)
					queue.offer(new int[] {++pNum, 1});
					
				}
			}
		}

	}

}
