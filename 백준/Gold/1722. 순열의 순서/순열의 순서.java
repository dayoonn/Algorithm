
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	static ArrayList<Integer> arr; // 원소 저장 배열
	static ArrayList<Integer> res; // 답 저장 배열
	static ArrayList<Integer> inputarr;
	static String N;
	static long M;

	static String ans;
	static long result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		ans = "";
		result = 0;
		arr = new ArrayList<Integer>();
		res = new ArrayList<Integer>();
		inputarr = new ArrayList<Integer>();
		for (int i = 1; i <= N; i++)
			arr.add(i);

		int ver = Integer.parseInt(st.nextToken());
		if (ver == 1) {
			long M =Long.parseLong(st.nextToken());
			ver1(M - 1);
		} else if(ver==2) {
			for(int i=0;i<N;i++) inputarr.add(Integer.parseInt(st.nextToken()));
			ver2(inputarr.remove(0));
		}

		print();
	}

	private static void ver2(int num) {

		long f = factorial(arr.size() - 1);
		int minnum = arr.indexOf(num);
		result += f * minnum;
		arr.remove(arr.indexOf(num));
		
		if (inputarr.size() == 0) {
			result += 1;
			ans += result;
			return;
		}
		ver2(inputarr.remove(0));

	}

	private static void ver1(long index) {
		if (index == 0) {
			while (arr.size() > 0)
				res.add(arr.remove(0));
			for (int i : res) {
				ans += i;
				ans += " ";
			}

			return;
		}
		long f = factorial(arr.size() - 1);
		long a=index / f;
		res.add(arr.remove((int)a));
		index = index % f;
		ver1(index);

	}

	private static long factorial(long n) {
		if (n > 0)
			return n * factorial(n - 1);
		else
			return 1;
	}

	private static void print() {
		System.out.println(ans);
	}

}
