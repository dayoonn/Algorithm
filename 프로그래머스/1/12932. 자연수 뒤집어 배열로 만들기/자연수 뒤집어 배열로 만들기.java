import java.util.*;
class Solution {
    public List<Integer> solution(long n) {
        List<Integer> answer=new ArrayList<>();
        String str=Long.toString(n);

        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        
        sb.toString().chars().
            forEach(x->answer.add(x-'0'));
        
        return answer;
    }
}