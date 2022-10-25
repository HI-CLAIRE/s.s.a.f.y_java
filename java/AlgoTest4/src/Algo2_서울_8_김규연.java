import java.util.ArrayList;
import java.util.Scanner;

public class Algo2_서울_8_김규연 {
	// Node를 만들어서 input 받을 때 저장
	public static class Node{
		int c1;
		int c2;
		int cost;
		public Node(int c1, int c2, int cost) {
			this.c1 = c1;
			this.c2 = c2;
			this.cost = cost;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int V = sc.nextInt(); //도시갯수
			int E = sc.nextInt(); //연결된 간선 갯수
			int M = sc.nextInt(); //배정된 예산
			
			ArrayList<Node> map = new ArrayList<>();
			// E번만큼 반복
			while(E-->0) {
				Node node = new Node(sc.nextInt(),sc.nextInt(),sc.nextInt());
				map.add(node);
			}
			
			// 모르겠습니다...
			// dfs..?
			// 재귀를 돌리면서 연결된 간선의 비용을 ans에 계속 더해본다..
			// 방문한 도시는 boolean visited[]에 방문했음을 표시한다..
			// 방문하지 않았으면서 인접한 도시를 계속해서 방문하며 ans에 cost를 더해본다..
			// 재귀종료 1) 더이상 방문할 도시가 없을때 -> 탐색종료 후 저장된 ans와 min값 비교(Math.min(ans, min))
			// 재귀종료 2) ans > M 더이상 탐색할 필요가 없으므로 종료 후 다른 루트 탐색
			// 재귀종료 3) 탐색을 마쳤는데도 (2)조건에서 종료가 된다면 -1을 출력
		
			int ans = -1;
			// dfs();
			System.out.println("#" + tc + " " + ans);
		}

	}

}
