import java.util.*;
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String s_a=Integer.toString(a);
        String s_b=Integer.toString(b);
        
        String ab=s_a+s_b;
        String ba=s_b+s_a;
        
        if(Integer.parseInt(ab)>Integer.parseInt(ba)) answer=Integer.parseInt(ab);
        else answer=Integer.parseInt(ba);

        return answer;
    }
}