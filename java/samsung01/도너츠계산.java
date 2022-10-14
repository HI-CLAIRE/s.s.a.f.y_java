package samsung01;

import java.util.Scanner;

public class ��������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			
			int[][] map = new int[1000][1000];
			
			// map input
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					map[i][j] = sc.nextInt();
				}
			}
			
			// �������� (������ǥ�� ���� �ٲ� ������ max������ �������ֱ�
			int ans = 0;
			
			// ������ǥ�� for���� �����鼭 �̾��ֱ� (r,c)
			for(int r=0; r<=N-K; r++) {
				for(int c=0; c<=N-K; c++) {
					
					// map�� ��ȸ�ϸ鼭 ������ǥ�� �������� K���̸�ŭ �������� �����ֱ�
					int tmp = 0;
				

					// ����
					// (0,0) (1,0) (2,0)
					for(int nr=r; nr<r+K; nr++) {
						tmp += map[nr][c];
						
					}
					
					// ����
					// (0,0) (0,1) (0,2)
					for(int nc=c; nc<c+K; nc++) {
						tmp += map[r][nc];
					}
					
					// ������
					// (0,2) (1,2) (2,2)
					for(int nr=r; nr<r+K; nr++) {
						tmp += map[nr][c + K-1];
					}
					
					// �Ʒ���
					// (2,0) (2,1) (2,2)
					for(int nc=c; nc<c+K; nc++) {
						tmp += map[r + K - 1][nc];
					}

					int edge = map[r][c] + map[r+K-1][c] + map[r][c+K-1] + map[r+K-1][c+K-1];
					tmp -= edge;
					
					ans = Math.max(ans, tmp);
				}
			}
			
			System.out.println("#" + tc + " " + ans);
			
		}
		
		
	}

}
