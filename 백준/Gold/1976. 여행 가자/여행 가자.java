
import java.util.Scanner;

public class Main {
	static int[] parent;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt(); //도시개수
		int M=sc.nextInt();//여행 경로 데이터
		
		int[][] city=new int[N+1][N+1];
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				city[i][j]=sc.nextInt();
			}
		}
		
		parent=new int[N+1];
		for(int i=0;i<=N;i++) parent[i]=i;
		
		int[] route=new int[M];
		for(int i=0;i<M;i++) route[i]=sc.nextInt(); //루트 경로 입력받기
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N;j++) {
				if(city[i][j]==1) union(i,j);
			}
		}
		
		//여행 계획 도시들이 1개의 대표도시로 연결되어 있는지 호가인하기
		int index=find(route[0]);
		for(int i=1;i<M;i++) {
			if(index!=find(route[i])) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
	
	public static void union(int a, int b) {
		a=find(a);
		b=find(b);
		if(a!=b) parent[a]=b;
	}
	public static int find(int a) {
		if(parent[a]==a) return a;
		else return parent[a]=find(parent[a]);
	}

}
