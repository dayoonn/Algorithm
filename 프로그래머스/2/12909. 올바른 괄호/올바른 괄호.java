import java.util.*;

class Solution {
    boolean solution(String s) {
       
        Stack<Character> stack=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            Character input=s.charAt(i);
            if(input=='(') stack.push(input);
            else{
                if(stack.size()<=0) return false;
                else stack.pop();
            }
        }
        if(stack.size()>0) return false;

        return true;
    }
}