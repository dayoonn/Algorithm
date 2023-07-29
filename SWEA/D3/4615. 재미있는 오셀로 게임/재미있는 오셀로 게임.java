
import java.util.*;

public class Solution {

	static int[][] A;
	static int N, M;
	static int[] dx = new int[] { 0, 0, -1, +1, -1, +1, -1, +1 }; // 상하좌우 왼위 오위 왼아 오아
	static int[] dy = new int[] { -1, +1, 0, 0, -1, -1, +1, +1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			N = sc.nextInt(); // N*N
			M = sc.nextInt(); // 실행 수

			A = new int[N + 1][N + 1];
			A[N / 2][N / 2] = 2;
			A[N / 2][N / 2 + 1] = 1;
			A[N / 2 + 1][N / 2] = 1;
			A[N / 2 + 1][N / 2 + 1] = 2; // 바둑판 초기

			for (int i = 0; i < M; i++) {
				int col = sc.nextInt();
				int row = sc.nextInt();
				int ver = sc.nextInt();

				put(row, col, ver);
			}

			int cntB = 0;
			int cntW = 0;
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (A[i][j] == 1)
						cntB++;
					else if (A[i][j] == 2)
						cntW++;
				}
			}

			System.out.println("#" + tc + " " + cntB + " " + cntW);

		} // end for tc
	}

	private static void put(int row, int col, int ver) {

		A[row][col] = ver; // 바둑 놓기

		for (int i = 0; i < dx.length; i++) {
			int cnt = sameLoc(row + dy[i], col + dx[i], ver, i);

			int r = row;
			int c = col;

			for (int j = 0; j < cnt; j++) { // cnt번 반복
				r += dy[i];
				c += dx[i];
				if ( A[r][c] != 0)
					A[r][c] = ver; // 나의 돌로 변경
			} // end for for

		} // end for
	}

	private static int sameLoc(int row, int col, int ver, int i) {

		int cnt = 0;
		while (row > 0 && row <= N && col <= N && col > 0) {
			if (A[row][col] == ver)
				return cnt;
			if(A[row][col]==0) return 0;
			row += dy[i];
			col += dx[i];
			cnt++;
		}

		return 0;

	}

}
