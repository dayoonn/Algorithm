import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	static class Node {
		int value; // 노드값
		char opr;// 연산자
		int left = -1;
		int right = -1;// 노드번호 -1은 자식노드라는 뜻(왼쪽오른쪽 없음)

		public Node(int value, char opr, int left, int right) {
			super();
			this.value = value;
			this.opr = opr;
			this.left = left;
			this.right = right;
		}

		public Node(int val) {
			this(val, ' ', -1, -1);
		}
	}

	static int N;// 노드 갯수
	static int result;// 계산결과
	static Node[] nodes;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int t = 1; t <= 10; t++) {
			N = Integer.parseInt(br.readLine()); // 정점개수
			nodes = new Node[N + 1];
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				if (st.countTokens() == 4) {
					int nodenum = Integer.parseInt(st.nextToken());
					char op = st.nextToken().charAt(0);
					int left = Integer.parseInt(st.nextToken());
					int right = Integer.parseInt(st.nextToken());
					nodes[nodenum] = new Node(0, op, left, right);
				} else {
					int nodenum = Integer.parseInt(st.nextToken());
					int val = Integer.parseInt(st.nextToken());
					nodes[nodenum] = new Node(val);
				}
			}
			int answer = calc(nodes[1]);
			System.out.println("#"+t+" "+answer);

		} // end for testcase
	}

	private static int calc(Node node) {
		// 연산자 추출
		char opr = node.opr;
		if (opr == '-') {
			return calc(nodes[node.left]) - calc(nodes[node.right]);
		} else if (opr == '+') {
			return  calc(nodes[node.left]) + calc(nodes[node.right]);
		} else if (opr == '*') {
			return calc(nodes[node.left]) * calc(nodes[node.right]);
		} else if (opr == '/') {
			return calc(nodes[node.left]) / calc(nodes[node.right]);
		} else {
			return node.value;
		}
	}

}
