import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int[] loca;
	static boolean[] visited;
	static int[] dx = { -1, +1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 수빈이 위치
		loca = new int[100001]; // 위치 좌표
		visited = new boolean[100001];

		int K = sc.nextInt(); // 동생좌표

		bfs(N);

		System.out.println(loca[K]);

	}// end main

	public static void bfs(int x) {
		Queue<Integer> q = new LinkedList<>();
		q.add(x); // 현재 좌표 큐에 저장
		visited[x] = true;

		while (!q.isEmpty()) {
			int now = q.poll();
			for (int i = 0; i < 2; i++) { // 걷기
				int next = now + dx[i];
				if (check(next)) { // 방문한적이 없으면
					visited[next] = true;
					loca[next] = loca[now] + 1; // 이전 좌표 누적값+1으로 업데이트
					q.add(next); // 큐에 이동가능한 좌표 삽입
				}
			}
			// 순간이동
			int next = now * 2;
			if (check(next)) { // 방문한적이 없으면
				visited[next] = true;
				loca[next] = loca[now] + 1; // 이전 좌표 누적값+1으로 업데이트
				q.add(next); // 큐에 이동가능한 좌표 삽입

			} // end check for
		} // end while

	}

	public static boolean check(int x) {

		if (x >= 0 && x < 100001) {
			if (!visited[x])
				return true;
		}
		return false;
	}

}
