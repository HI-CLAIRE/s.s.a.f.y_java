package d2;

import java.util.Scanner; //커밋되나?

public class 숫자배열회전_1961 {
	private static int[][] turn(int[][] arr, int N) {
		// x, y 뒤집어
		int[][] ans = new int[N][N];
		for(int i=0; i<N; i++)
			for(int j=0; j<N; j++)
				ans[j][(N-1)-i] = arr[i][j];
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++)
		{
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<N; j++)
					arr[i][j] = sc.nextInt();
			}
			int[][] ans1 = turn(arr, N); //90도 
			int[][] ans2 = turn(ans1, N); //180도 
			int[][] ans3 = turn(ans2, N); //270도
			
			//출력
			System.out.print("#" + tc);
			System.out.println();
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<N; j++)
					System.out.print(ans1[i][j]);
				System.out.print(" ");
				for(int j=0; j<N; j++)
					System.out.print(ans2[i][j]);
				System.out.print(" ");
				for(int j=0; j<N; j++)	
					System.out.print(ans3[i][j]);
				System.out.println();
			}
			
		}
	}

}
