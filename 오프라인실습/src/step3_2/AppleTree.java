package step3_2;

//import java.util.Arrays;
import java.util.Scanner;

public class AppleTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dr = {1, -1, 0, 0};
		int[] dc = {0, 0, -1, 1};
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[][] map = new int[N][N];
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
				map[i][j] = sc.nextInt();
		}
//		System.out.println(Arrays.deepToString(map));
		int max = 0;
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<N; j++)
			{
				int cnt = map[i][j];
				for(int d=0; d<4; d++)
				{
					int nr = i + dr[d];
					int nc = j + dc[d];
					
					//경계처리
					if(0<=nr && nr<N && 0<=nc && nc<N)
					{
						cnt += map[nr][nc];
					}
				}
				max = Math.max(max, cnt);
			}
		}
		sc.close();
		System.out.println(max);
	}
}
