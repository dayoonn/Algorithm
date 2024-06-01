import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.size()==0) st.push(s.charAt(i));
            else{
               if(st.peek()==s.charAt(i)) st.pop();
                else st.push(s.charAt(i));
            }
        }
        if(st.size()==0) answer=1;
        else answer=0;


        return answer;
    }
}