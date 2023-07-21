package 백트래킹_장훈이의높은선반_b1486;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
	static int[] height;
	static int N, B;
	static int min;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine());
		for(int tc=1;tc<=T;tc++) {
			StringTokenizer st = new StringTokenizer(in.readLine()," ");
			N = Integer.parseInt(st.nextToken());	// 점원 수
			B = Integer.parseInt(st.nextToken());	// 선반 높이
			
			height = new int[N];
			st = new StringTokenizer(in.readLine()," ");
			for(int i=0;i<N;i++) {
				height[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(height);
			min = Integer.MAX_VALUE;
//			subset(0,new boolean[N]);
			dfs(0,0);
			sb.append("#").append(tc).append(' ').append(min).append('\n');
		}
		System.out.println(sb);
	}
	static void subset(int cnt, boolean[] isSelected) {
		if(cnt == N) {
			int sum = 0;
			for(int i=0;i<N;i++) {
				if(isSelected[i]) {
					sum += height[i];
				}
				if(sum>=B && sum-B>=min) return;
			}
			if(sum>=B) {
				min = Math.min(min, sum-B);
			}
			return;
		}
		isSelected[cnt] = true;
		subset(cnt+1, isSelected);
		
		isSelected[cnt] = false;
		subset(cnt+1, isSelected);
		
	}
	static void dfs(int cnt, int sum) {
		if(cnt==N) {
			if(sum>=B) {
				min = Math.min(min, sum-B);
			}
			return;
		}
		dfs(cnt+1 , sum+ height[cnt]);
		dfs(cnt+1 , sum);
	}
}