import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
         int answer = 0;
        int len=board.length;
        Stack<Integer>[] st=new Stack[len];
        
        for(int i=0;i<len;i++) st[i]=new Stack<Integer>();
      
       
        
        for(int row=len-1;row>=0;row--){
            for(int col=0;col<len;col++){
                if(board[row][col]!=0) st[col].push(board[row][col]);
            }
        }
        Stack<Integer> result=new Stack<>();
        int before=-1;
        for(int m:moves){
            if(result.size()>0){
                before=result.peek();
            }
            if(!st[m-1].isEmpty()){
            int now=st[m-1].pop();
            result.push(now);
        
            if(before==now){
                result.pop();
                result.pop();
                before=-1;
                answer++;
                answer++;
            }
            }
        }
       
        return answer;
    }
}