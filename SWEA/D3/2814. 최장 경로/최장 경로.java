import java.util.*;

public class Solution {
	static int N, M;
	static boolean[] visited;
	static int max; //최장경
	static ArrayList<ArrayList<Integer>> a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {

			N = sc.nextInt();
			M = sc.nextInt();

			max = 0;
			a = new ArrayList<>();
			visited = new boolean[N + 1];

			for (int i = 0; i <= N; i++) {
				a.add(new ArrayList<>());
			}

			for (int i = 0; i < M; i++) {
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();

				a.get(n1).add(n2);
				a.get(n2).add(n1); //양방향
			}

			for (int i = 1; i <= N; i++)
				dsf(i, 1);

			System.out.println("#" + tc + " " + max);

		} // end for tc
	}

	private static void dsf(int i, int cnt) {
		visited[i] = true;

		for (int j = 0; j < a.get(i).size(); j++) {
			int next = a.get(i).get(j);
			if (!visited[next]) {
				dsf(next, cnt + 1); //재귀

				visited[next] = false; 
			}
		}

		visited[i] = false;
		if (cnt > max)
			max = cnt;

	}

}
