import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String s=Integer.toString(n);
        for(char ch:s.toCharArray()){
           answer+= ch-'0';
          
        }

        return answer;
    }
}