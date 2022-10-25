import java.util.Scanner;

public class Algo1_서울_8_김규연 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			
			// ans가 21472836을 넘어가므로 오버플로우가 뜨지 않게 하기 위해 long으로 설정
			long ans = 1;
			
			// N번만큼 반복
			while(N-->0) {
				
				// 꿩먹고 알먹고 시행
				ans = (ans * 4) + 9;
				
				// 만약 1234567891을 넘으면 ans에 1234567891로 나눈 나머지를 저장
				if(ans >= 1234567891) {
					ans %= 1234567891;
				}
			}
			
			// 출력
			System.out.println("#" + tc + " " + ans );
		}
		sc.close();
	}

}

/*
 * dp로 풀면 실행시간이 단축될 수 있을 것 같다..
 * 어떻게는.. 생각을 못 하겠음..
 */
