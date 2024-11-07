import java.util.*;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        char[] arrChar=number.toCharArray();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i=arrChar.length-1;i>=0;i--) st1.push(arrChar[i]);
        int cnt=k;
        Character now = st1.pop();
        st2.push(now);
        Character next = 0;
        
        while(k>0  && !st1.isEmpty()){
            if(st2.isEmpty()) st2.push(st1.pop());
            now = st2.peek();
            next = st1.peek();
            
            if(now<next){
                st2.pop();
                k--;
                
            }else{
                st2.push(st1.pop());
            }
        }
        
        while(k>0){
            st2.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st2.isEmpty()) {sb.append(st2.pop());}
        
        sb = sb.reverse();
        while(!st1.isEmpty()) {sb.append(st1.pop());}
        answer=sb.toString();
        
        
        return answer;
    }
}