import java.util.PriorityQueue;
import java.util.Scanner;



public class Main {
	static int[] parent;
	static PriorityQueue<pEdge> queue;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt(); //노드 개수
		int E=sc.nextInt(); //엣지 개수
		
		queue=new PriorityQueue<>(); //자동정렬을 위해 우선순위 큐 자료구조 선택
		
		parent=new int[N+1];
		for(int i=0;i<N;i++) parent[i]=i;
		
		for(int i=0;i<E;i++) { //엣지 개수만큼 반복
			int n1=sc.nextInt(); //노드1
			int n2=sc.nextInt(); //노드2
			int v=sc.nextInt(); //가중치
			queue.add(new pEdge(n1,n2,v));
		}
		
		int useEdge=0; //사용한 엣지 수
		int result=0; //가중치 합
		
		while(useEdge<N-1) { //주어진 엣지 개수보다 사용 엣지 개수가 작을때까지 반복
			pEdge now=queue.poll();
			if(find(now.node_e)!=find(now.node_s)) { //싸이클 방지
				union(now.node_e,now.node_s);
				result+=now.v;
				useEdge++;
			}
		}
		
		System.out.println(result);
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

class pEdge implements Comparable<pEdge> {
	int node_s;
	int node_e;
	int v; //가중치
	public pEdge(int s, int e, int v) {
		super();
		this.node_s = s;
		this.node_e = e;
		this.v = v;
	}
	@Override
	public int compareTo(pEdge o) { //가중치가 가장 작은 순
		return this.v-o.v;
	}
	
}