package BOJ;

import java.util.Scanner;

public class 색종이2_2567 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int[][] sq = new int[100][100];
		
		int num = sc.nextInt();
		for(int n=0; n<num; n++) {  //사각형을 1로 다 채움
			x = sc.nextInt();
			y = sc.nextInt();
			
			for(int i=x; i<x+10; i++)
				for(int j=y; j<y+10; j++)
					sq[i][j] = 1;
		}
		
		for(int i=0; i<sq.length; i++) {
			for(int j=0; j<sq[i].length; j++)
				System.out.print(sq[i][j]);
			System.out.println();
		}
	}

}
