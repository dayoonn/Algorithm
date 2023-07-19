
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static boolean[] visited;
	static ArrayList<Integer>[] A;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int Start=sc.nextInt();
		
		A=new ArrayList[N+1];
		for(int i=1;i<=N;i++) A[i]=new ArrayList<Integer>();
		
		for (int i = 1; i <= M; i++) {
			
			int s = sc.nextInt();
			int e = sc.nextInt();

			A[s].add(e);
			A[e].add(s);
		}
		
		for(int i=1;i<=N;i++) {
			Collections.sort(A[i]);
		}
		visited=new boolean[N+1];
		DFS(Start);
		System.out.println();
		visited=new boolean[N+1];
		BFS(Start);
		System.out.println();
		
		
		
	}
	private static void BFS(int node) {
		Queue<Integer> que=new LinkedList<Integer>();
		que.add(node);
		visited[node]=true;
		
		while(!que.isEmpty()) {
			int now_node=que.poll();
			System.out.print(now_node+" ");
			for(int i:A[now_node]) {
				if(!visited[i]) {
					visited[i]=true;
					que.add(i);
				}
			}
		}
	}
	private static void DFS(int node) {
		System.out.print(node+" ");
		visited[node]=true;
		for(int i:A[node]) {
			if(!visited[i]) DFS(i);
		}
	}

}
