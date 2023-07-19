
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<Integer>[] A;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		A = new ArrayList[N + 1];
		visited = new boolean[N + 1];
		for (int i = 1; i <= N; i++)
			A[i] = new ArrayList<Integer>();

		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(bf.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());

			A[s].add(e);
			A[e].add(s);
		}

		int answer=0;
		for(int i=1;i<=N;i++) {
			if(!visited[i]) {
				DFS(i);
				answer++;
			}
		}
		
		System.out.println(answer);
		

	}

	private static void DFS(int node) {
		Stack<Integer> stk = new Stack<Integer>();
		visited[node] = true;
		stk.add(node);

		while (!stk.isEmpty()) {
			int now_node = stk.pop();
			for (Integer near : A[now_node]) {
				if(!visited[near]) {
					visited[near]=true;
					stk.add(near);
				}
			}//end for
		}//end while
	}
}
