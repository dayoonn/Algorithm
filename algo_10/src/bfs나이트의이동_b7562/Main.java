package bfs나이트의이동_b7562;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
static int N;
static int[][] chess;
static boolean[][] visited;
static int[] dx= {+1,+2,+2,+1,-1,-2,-2,-1}; //1,2,4,5,7,8,10,11시 방향
static int[] dy= {-2,-1,+1,+2,+2,+1,-1,-2};

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(); //테스트케이스
		for(int tc=1;tc<=T;tc++) {
			
			N=sc.nextInt(); //한변의 길이
			chess=new int[N][N]; //체스판 생성
			visited=new boolean[N][N];
			
			int s_y=sc.nextInt(); //시작 좌표
			int s_x=sc.nextInt();
			
			int e_y=sc.nextInt(); //도착 좌표
			int e_x=sc.nextInt();
			
			bfs(s_y,s_x);
			
			
			System.out.println(chess[e_y][e_x]);
			
			
			
		}//end for tc
	}//end main
	


	public static void bfs(int s_y, int s_x) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { s_y, s_x }); // 현재 좌표 큐에 저장
		visited[s_y][s_x] = true;
		

		while (!q.isEmpty()) {
			int[] now = q.poll();
			for (int i = 0; i < 8; i++) {
				int now_y = now[0] + dy[i]; //이동한 좌표
				int now_x = now[1] + dx[i];
				if (check(now_y, now_x)) { // 방문한적이 없으면 
					visited[now_y][now_x] = true; 
					chess[now_y][now_x] = chess[now[0]][now[1]]+1; //이전 좌표 누적값+1으로 업데이트
					q.add(new int[] { now_y, now_x }); //큐에 이동가능한 좌표 삽입
					
				}
			} // end check for
		} // end while

	}

	public static boolean check(int y, int x) {
		
		if (x >= 0 && y >= 0 && x < N && y < N) {
			if (!visited[y][x])
				return true;
		}
		return false;
	}

}
