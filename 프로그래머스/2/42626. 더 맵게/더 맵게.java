import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer =0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int n:scoville) pq.add(n);
        
        while(pq.size()>=2 && pq.peek()<K){
            int min1=pq.poll();
            int min2=pq.poll();
            
            pq.add(min1+(min2*2));
            answer++;
            
            
        }
        
        if(pq.peek()<K) answer=-1;
        
        return answer;
    }
}