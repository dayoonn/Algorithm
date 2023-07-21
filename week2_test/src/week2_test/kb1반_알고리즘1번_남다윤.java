package week2_test;

import java.util.Scanner;

public class kb1반_알고리즘1번_남다윤 {
	static int n;
	static int[] parent;


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		parent=new int[n+1];
		for(int i=0;i<=n;i++) parent[i]=i;
		
		int m=sc.nextInt(); //관계 수
		for(int i=0;i<m;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			union(a,b);
		}
		
		int cnt=0;
		int CS=1; //철수
		for(int i=2;i<=n;i++) {
			if(find(CS)==find(i)) cnt++;  //철수의 대표노드와 같으면 cnt++
		}
		
		System.out.println(cnt);
	}
	private static void union(int a, int b) {
		a = find(a); //대표노드 찾기
		b = find(b);
		if (a != b) { //대표노드가 다르다면 a의 대표노드를 b의 대표노드로 업데이트
			parent[a] = b; 
		}
	}

	private static int find(int a) {
		if (a == parent[a]) //a와 a의 대표노드가 같다면
			return a; //a를 리턴
		else //a와 a의 대표노드가 다르다면
			return  parent[a]=find(parent[a]); //a의 대표노드를 다시 탐색
	}
}