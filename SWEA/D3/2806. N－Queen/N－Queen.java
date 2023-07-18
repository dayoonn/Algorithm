import java.util.Scanner;

public class Solution {
	static int answer;

	static int N;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int testcase = 1; testcase <= T; testcase++) {

			answer = 0;
			N = sc.nextInt();

			int row = 0;
			int col = 0;

			boolean[][] A = new boolean[N][N];
			func(A, 0, 0);

			System.out.println("#" + testcase + " " + answer);
		} // end for testcase
	}

	private static void func(boolean[][] a, int r, int c) {
		boolean[][] A = a;
		boolean[][] tmp = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				tmp[i][j] = a[i][j];
			}
		}
		if (r > N - 1 || c > N - 1)
			return;
		else if (A[r][c] == true) {
			func(A, r, c + 1);
			return;
		} else if (r == N - 1 && !A[r][c]) {
			answer++;
			// 디버그 출력용
//			for (boolean[] ba : A) {
//				for(boolean b:ba)
//					System.out.print(b+" ");
//				System.out.println();
//			}
//			
//			System.out.println("***");
		}

		for (int rr = r; rr < N; rr++) {
			A[rr][c] = true; // 열
		}
		// 오른쪽 아래 대각선
		int row = r;
		int col = c;
		while (col < N && row < N) {
			A[row++][col++] = true;
		}
		// 왼쪽 아래 대각선
		row = r;
		col = c;
		while (col >= 0 && row < N) {
			A[row++][col--] = true;
		}

		func(A, r + 1, 0);// 재귀호출
		func(tmp, r, c + 1);
	}

}