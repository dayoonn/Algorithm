import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        StringTokenizer st;
		int[][] A=new int[100][100];

		for(int test_case = 1; test_case <= 10; test_case++)
		{	int t = Integer.parseInt(br.readLine());
		
			
			int row=99;
			int col=0;
			
			for(int i=0;i<100;i++) {
				 st = new StringTokenizer(br.readLine());
				for(int j=0;j<100;j++) {
					A[i][j]=Integer.parseInt(st.nextToken());
					if(A[i][j]==2) col=j;
				}
			}
			
			while(row>0) {
				
				if(col>0 && A[row][col-1]==1) {
						A[row][col]=0;
						col--;
				}else if(col<99 && A[row][col+1]==1) {
					A[row][col]=0;
					col++;
				}
				else {
					row--;
				}
			}//end while
			
			System.out.println("#"+test_case+" "+col);
			
			
			
		}
	}
}