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
			this(val, ' ', -1, -1); //숫자노드라면 연산자,자식노드없음
		}
	}

	static int N;// 노드 갯수
	static int result;// 계산결과
	static Node[] nodes;
	static boolean b;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int t = 1; t <= 10; t++) {
			b=false; //계산가능 여부를 판단할 변수
			N = Integer.parseInt(br.readLine()); // 정점개수
			nodes = new Node[N + 1]; //노드 1번부터 N번
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine()); //해당 정점에 대한 정보
				
				if (st.countTokens() == 4) { //입력이 4개이면
					int nodenum = Integer.parseInt(st.nextToken()); //노드번호
					char op = st.nextToken().charAt(0); //연산자
					int left = Integer.parseInt(st.nextToken()); //왼쪽 자식의 정점번호
					int right = Integer.parseInt(st.nextToken());//오른쪽 자식의 정점번호
					nodes[nodenum] = new Node(0, op, left, right); //노드 생성
				} else {
					int nodenum = Integer.parseInt(st.nextToken()); //노드 번호
					char c= st.nextToken().charAt(0); //value값 or 연산자 입력받음
					
					if(c == '-' ||c == '+'||c == '*' || c == '/') { //연산자이면
						nodes[nodenum] = new Node(0, c, -1, -1);//노드생성
					}else {
						int val = c-'0'; //value값을 int 로 변환
						nodes[nodenum] = new Node(val);	//노드생성				
					}
				}
			}//end for input
			
			calc(nodes[1]); //1번노드부터 계산
			if(b) System.out.println("#"+t+" "+0);
			else System.out.println("#"+t+" "+1);
		

		} // end for testcase
	}

	private static void calc(Node node) {
		// 연산자 추출
		char opr = node.opr; 
		if (opr == '-' ||opr == '+'||opr == '*' || opr == '/') {//연산자면
			if(node.left==-1||node.right==-1) { //연산자이지만 자식노드가 없으면 계산 x : return
				b=true;
				return ;
			}
            calc(nodes[node.left]); //자식노드로 내려감
			calc(nodes[node.right]);
			
		}
		 else {
			if(node.left!=-1||node.right!=-1) { //숫자이지만 자식노드가 있으면 계산 x: return
				b=true;
				return;
			}
		}
	}

}
