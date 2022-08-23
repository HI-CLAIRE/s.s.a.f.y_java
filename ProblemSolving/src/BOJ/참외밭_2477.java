package BOJ;

import java.util.Scanner;

public class 참외밭_2477 {

	public static void main(String[] args) {
		//방향 동1, 서2, 남3, 북4
		
		Scanner sc = new Scanner(System.in);
		int melon = sc.nextInt();
		
		int[][] arr = new int[6][2];
		boolean flag = false;
		int maxSq = 0, minSq = 0, ans = 0;
		
		for(int i=0; i<6; i++) {
			int dir = arr[i][0];
			int val = arr[i][1];
			dir = sc.nextInt();
			val = sc.nextInt();
			
			
		}
		System.out.println(ans * melon);
	}

}
