package week2_test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class kb1반_알고리즘2번_남다윤 {

	static int n, m;
	static boolean[][] visited;
	static int[][] A;
	static int[] dx = { 0, 0, -1, +1 }; // 상하좌우
	static int[] dy = { -1, +1, 0, 0 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt(); //열
		n = sc.nextInt(); //행

		A = new int[n + 1][m + 1];
		visited = new boolean[n + 1][m + 1];
		for (int i = 1; i <= n; i++) { // 학생좌표 저장
			char[] arr_ch= sc.next().toCharArray();
			for (int j = 0; j < m; j++)
				A[i][j+1] = arr_ch[j]-'0'; 
		}
		
		int x=sc.nextInt(); //걸린학생 좌표
		int y=sc.nextInt(); //걸린학생 좌표
		A[y][x]=3; //최초 걸린학생 3일 후 퇴소
		
		bfs(y, x);
		
		int max=3;
		int OK=0; //코로나 안걸린 학생 수
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(A[i][j]>max) max=A[i][j];
				if(A[i][j]==1) OK++;
			}
		}
		
		System.out.println(max);
		System.out.println(OK);

	}

	private static void bfs(int y, int x) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { y, x }); // 현재 좌표 큐에 저장
		visited[y][x] = true;

		while (!q.isEmpty()) {
			int[] now = q.poll();
			for (int i = 0; i < 4; i++) {
				int now_y = now[0] + dy[i]; //상하좌우 이동한 좌표
				int now_x = now[1] + dx[i];
				if (check(now_y, now_x, i)) { // 상하좌우 방문한적이 없으면 
					visited[now_y][now_x] = true; 
					A[now_y][now_x] = A[now[0]][now[1]]+1; //이전 좌표 누적값+1으로 업데이트
					q.add(new int[] { now_y, now_x }); //큐에 상하좌우 이동가능한 좌표 삽입
				}
			} // end check for
		} // end while

	}

	private static boolean check(int y, int x, int i) {
		
		if (x >= 1 && y >= 1 && x <= m && y <= n) {
			if (A[y][x] != 0 && !visited[y][x])
				return true;
		}
		return false;
	}

}
