import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		Stack<Integer> stk = new Stack<Integer>();
		int[] arr = new int[N];

		StringTokenizer st;
		for (int i = 0; i < N; i++) {
			st= new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int cnt = 1;
		StringBuffer bf = new StringBuffer();
		boolean b = true;

		for (int i = 0; i < N; i++) {
			int num = arr[i];
			while (true) {
				if (stk.empty() || stk.peek() <= num) {
					if (!stk.empty()&&stk.peek() == num) {
						stk.pop();
						bf.append("-\n");
						break;
					}else {
					stk.push(cnt++);
					bf.append("+\n");}
				} else if(!stk.empty()&&stk.peek()>num){
					System.out.println("NO");
					b = false;
					break;
				}

			}

			if(!b) break;

		}
		if (b)
			System.out.println(bf.toString());

	}
}