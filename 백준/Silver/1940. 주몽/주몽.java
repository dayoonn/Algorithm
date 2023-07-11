import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(); // 재료개수
		int M=sc.nextInt(); //번호의 합
		int[] A=new int[N];
		
		for(int i=0;i <N;i++) {
			A[i]=sc.nextInt();
		}
		
		Arrays.sort(A);
		
		int s=0; //start index
		int e=N-1; //end index
		int cnt=0;
		int sum=0;
		
		while(s<e) {
			sum=A[s]+A[e];
			if(sum==M) {
				cnt++;
				s++;e--;
			}else if(sum<M) {
				s++;
			}else {
				e--;
			}
			
		}
		
		
		System.out.println(cnt);
	}

}
