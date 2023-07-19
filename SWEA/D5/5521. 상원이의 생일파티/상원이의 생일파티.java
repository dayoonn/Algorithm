
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	static ArrayList<Integer>[] A;
	static int N;
	static int M;
	static boolean[] visited;
	static int cnt;
	static int[] cntarr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st= new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			A = new ArrayList[N + 1];
			visited=new boolean[N+1];
			for (int i = 0; i <= N; i++) {
				A[i] = new ArrayList<Integer>();
			}

			for (int i = 1; i <= M; i++) {
				st = new StringTokenizer(br.readLine());
				int n1 = Integer.parseInt(st.nextToken());
				int n2 = Integer.parseInt(st.nextToken());

				A[n1].add(n2); //친한친구는 양방향
				A[n2].add(n1);
              
			}
			
			
				Q(1);
				System.out.println("#"+tc+" "+cnt);
			

			
		}
	}

	private static void Q(int i) {
		cnt=0;
		Queue<Integer> queue = new LinkedList<Integer>();
		visited[i] = true;
        
		for(int k=0;k<A[1].size();k++) { //상원이의 친한친구들을 큐에 넣음
			queue.add(A[1].get(k));
			visited[A[1].get(k)] = true;
			cnt++;
		}
		
		while(!queue.isEmpty()) { //상원이의 친한친구의 친한친구들 중 visited가 false인 애들만 count
			int ii=queue.poll();
			for (Integer f : A[ii]) {
				if(!visited[f]) {
					visited[f]=true;
					cnt++;
				}
			}
		}
		
	}

}
