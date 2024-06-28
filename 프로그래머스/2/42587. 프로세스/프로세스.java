import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int find=priorities[location];
        int find_idx=location;
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Integer> q=new LinkedList<>();
        for(int num:priorities){
            pq.add(num);
            q.add(num);
        }
      
        int answer = 0;
        
        while(!pq.isEmpty()){
            if(pq.peek()==q.peek()){
                answer++;
                if(find_idx==0) break; //찾는 넘버
                pq.poll(); q.poll();
                find_idx--;
            }else{
                int n=q.poll();
                q.offer(n);
                find_idx--;
                if(find_idx<0) find_idx=q.size()-1;
            }
        }
        
        
        
        return answer;
    }
}