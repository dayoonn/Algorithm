import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // int[] days=new int[progresses.length];
        Queue<Integer> days=new LinkedList<>();
        for(int i=0;i<progresses.length;i++){
            int remain=100-progresses[i];
            if(remain%speeds[i]==0) days.offer(remain/speeds[i]);
            else days.offer((remain/speeds[i])+1);
        }
        
        List<Integer> list=new ArrayList<>();
        
        
        int cnt=1;
        int max=days.poll();
       while(!days.isEmpty()){
            if(days.peek()>max) {
                list.add(cnt);
                cnt=1;
                max=days.poll();
            }else{
                cnt++;
                days.poll();
            }
            
        }
        list.add(cnt);
        int[] answer=list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}