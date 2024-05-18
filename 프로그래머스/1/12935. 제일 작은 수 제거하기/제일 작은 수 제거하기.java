import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        int min = Arrays.stream(arr).min().orElse(Integer.MAX_VALUE);
        
        int[] answer = Arrays.stream(arr).filter(n->n!=min).toArray();
        if(answer.length==0) answer=new int[]{-1};
        return answer;
    }
}