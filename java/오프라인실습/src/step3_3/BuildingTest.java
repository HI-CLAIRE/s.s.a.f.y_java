package step3_3;

import java.util.Scanner;

public class BuildingTest {
	
	//팔방탐색을 위한 배열 만들기
	//상, 하, 좌, 우
	static int[] dr = {1, -1, 0, 0, -1, -1, 1, 1}; //행
	static int[] dc = {0, 0, -1, 1, -1, 1, -1, 1}; //열

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc=1; tc<=T; tc++)
		{
			int N = sc.nextInt();
			String[][] map = new String[N][N];
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<N; j++)
				{
					map[i][j] = sc.next();
				}
			}
//			System.out.println(Arrays.deepToString(map));
			
			int max = -1; //최대높이 
			for(int r=0; r<N; r++)
			{
				for(int c=0; c<N; c++)
				{
					//(r, c)
					if("B".equals(map[r][c])) //String 비교는 항상 equals
					{
						boolean isThereG = false; //G가 없다고 가정
						for(int d=0; d<8; d++)
						{
							int nr = r + dr[d];
							int nc = c + dc[d]; //새로운 행과 열의 좌표 생성
							//경계처리
							if(0 <= nr && nr < N && 0<= nc && nc <N)
							{
								if("G".equals(map[nr][nc]))
									isThereG = true;
							}
						}
						int height = 0;
						if(isThereG)
							height = 2;
						else
						{
							int cnt = -1; //중심이 되는 칸이 2번 들어가니까 하나를 미리 빼둔다
							for(int i=0; i<N; i++)
							{
								if("B".equals(map[r][i]))
									cnt++;
								if("B".equals(map[i][c]))
									cnt++;
							}
							height = cnt;
						}
						if(height > max)
							max = height;
					}
				}
			}
			System.out.println("#" + tc + " " + max);
		}
		sc.close();
	}

}
