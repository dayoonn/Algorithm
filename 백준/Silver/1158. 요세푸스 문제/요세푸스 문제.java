import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		StringBuffer bf = new StringBuffer();
		bf.append("<");
		
		ArrayList<Integer> circle=new ArrayList<Integer>();
		for(int i=1;i<=N;i++) circle.add(i); //1~N까지 삽입
		
		int index=0; //
		while(circle.size()>1) {
			index=(index+K-1)%circle.size();
			bf.append(circle.remove(index%circle.size()));
			bf.append(", ");
			
		}

		bf.append(circle.remove((index+K-1)%circle.size())); //마지
		bf.append(">");
		
		System.out.println(bf.toString());

	}

}
