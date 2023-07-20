import java.util.Scanner;

public class Main {
	static int[] parent;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		parent = new int[N + 1];
		for (int i = 0; i <= N; i++)
			parent[i] = i; // 대표노드를 자기 자신으로 초기화

		for (int i = 0; i < M; i++) {
			int ver = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (ver == 0)
				union(a, b);
			else {
				if(check(a, b)) System.out.println("YES");
				else System.out.println("NO");
			}
		}

	}

	public static boolean check(int a, int b) {
		a=find(a); //대표노드 찾기
		b=find(b);
		if(a==b) return true; //대표노드가 같다면 true;
		else return false;
	}

	public static void union(int a, int b) {
		a = find(a); //대표노드 찾기
		b = find(b);
		if (a != b) { //대표노드가 다르다면 a의 대표노드를 b의 대표노드로 업데이트
			parent[a] = b; 
		}
	}

	public static int find(int a) {
		if (a == parent[a]) //a와 a의 대표노드가 같다면
			return a; //a를 리턴
		else //a와 a의 대표노드가 다르다면
			return  parent[a]=find(parent[a]); //a의 대표노드를 다시 탐색
	}
}
