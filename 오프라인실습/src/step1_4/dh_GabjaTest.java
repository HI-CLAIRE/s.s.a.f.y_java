package step1_4;

import java.util.Scanner;

public class dh_GabjaTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			// Input GABJA
			System.out.print("60갑자를 입력하세요: ");
			String str_INPUT = sc.nextLine();
			int val_GABJA = 0;
			char GABJA[][] = new char[][] { { '갑', '을', '병', '정', '무', '기', '경', '신', '임', '계' },
					{ '자', '축', '인', '묘', '진', '사', '오', '미', '신', '유', '술', '해' } };
			if ("종료".equals(str_INPUT)) {
				sc.close();
				return;
			}
			// Find val_GABJA
			for (int i = 0; i < 60; i++) {
				if (str_INPUT.charAt(0) == GABJA[0][i % 10] && str_INPUT.charAt(1) == GABJA[1][i % 12]) {
					val_GABJA = i;
				}
			}

			// Print Result
			for (int i = val_GABJA + 1444; i < 2100; i += 60) {
				if (i >= 1800)
					System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
