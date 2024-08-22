import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        
        for(int i=order.length;i>=1;i--){
            st1.push(i);
        }
        
        for(int now:order){
            if(!st1.isEmpty() && st1.peek()==now){
                st1.pop();
                answer++;
            }else if(!st2.isEmpty() && st2.peek()==now){
                st2.pop();
                answer++;
            }else{
                while(!st1.isEmpty() && st1.peek()!=now){
                    int move=st1.pop();
                    st2.push(move);
                }
                if(!st1.isEmpty()){
                    st1.pop();
                    answer++;
                }else{
                    break;
                }
            }
        }
        
        
        return answer;
    }
}