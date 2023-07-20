
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static int[] parent;
	static PriorityQueue<pEdge> queue;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine()); // 컴퓨터 개수

		int[][] len = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			char[] c = st.nextToken().toCharArray();
			for (int j = 0; j < N; j++) {
				len[i][j + 1] = con(c[j]); // 숫자 저장
			}
		}

		parent = new int[N + 1];
		for (int i = 0; i <= N; i++)
			parent[i] = i;

		int[] route = new int[N];
		for (int i = 0; i < N; i++)
			route[i] = i+1; // 1~N번컴퓨터

	

		queue = new PriorityQueue<>(); // 자동정렬을 위해 우선순위 큐 자료구조 선택
		int have = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				have += len[i][j];
				if (len[i][j] != 0 && i != j)
					queue.add(new pEdge(i, j, len[i][j]));
			}
		}

		int result = 0;
		while (!queue.isEmpty()) {
			pEdge now = queue.poll();
			if (find(now.node_s) != find(now.node_e)) {
				union(now.node_s, now.node_e);
				result += now.v;
			}
		}
		
		int index=find(route[0]);
		for(int i=1;i<N;i++) {
			if(index!=find(route[i])) {
				System.out.println(-1);
				return;
			}
		}
		
		System.out.println(have - result);

	}

	private static int con(char c) { // 영문을 숫자로 변환하는 함수
		if (c >= 'a' && c <= 'z')
			return c - 'a' + 1;
		else if (c == '0')
			return 0;
		else
			return c - 'A' + 27;

	}

	public static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if (a != b)
			parent[a] = b;
	}

	public static int find(int a) {
		if (parent[a] == a)
			return a;
		else
			return parent[a] = find(parent[a]);
	}

}

class pEdge implements Comparable<pEdge> {
	int node_s;
	int node_e;
	int v; // 가중치

	public pEdge(int s, int e, int v) {
		super();
		this.node_s = s;
		this.node_e = e;
		this.v = v;
	}

	@Override
	public int compareTo(pEdge o) {

		return this.v - o.v;
	}

}
