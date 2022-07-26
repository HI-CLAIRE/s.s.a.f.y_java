package d3;

import java.util.Scanner;

public class 정곤이의단조증가하는수_6190 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < N; i++)
				arr[i] = sc.nextInt();
			int max = -1; // 비교할 최대값
			int isDanjo = 0; // 단조인가?
			for (int i = 0; i < N - 1; i++) // 마지막 제외
			{
				for (int k = i; k < N - 1; k++) {
					isDanjo = arr[i] * arr[k + 1]; // 단조인가?
					int flag = 0; // 플래그 초기화
					String cmp = Integer.toString(isDanjo); // isDanjo를 하나하나 쪼갬
					for (int j = 0; j < cmp.length() - 1; j++) // isDanjo길이만큼 반복
					{
						if (cmp.charAt(j) > cmp.charAt(j + 1)) {
							flag = 1; // 플래그 전환
							break; // 단조가 아님 for문 빠져나감
						}
					}
					if (flag == 0) // 단조인 애들만 비교
						if (isDanjo > max)
							max = isDanjo;
				}
			}
			System.out.printf("#%d %d\n", tc, max);
		}
	}

}
