package 별찍기연습;

import java.util.Scanner;

public class 이등변삼각형 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
//		int[][] arr = new int[N][2*N];
//		int num = 1;
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<(2*N)-1; j++)
			{
				if(N-1-i > j)
					System.out.print(" ");
				else if(j <= N-1 + i)
					System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}