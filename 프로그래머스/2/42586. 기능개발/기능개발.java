import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] days=new int[progresses.length];
        for(int i=0;i<progresses.length;i++){
            int remain=100-progresses[i];
            if(remain%speeds[i]==0) days[i]=remain/speeds[i];
            else days[i]=(remain/speeds[i])+1;
        }
        
        List<Integer> list=new ArrayList<>();
        
        int cnt=1;
        int max=days[0];
        for(int i=1;i<days.length;i++){
            if(days[i]>max) {
                list.add(cnt);
                cnt=1;
                max=days[i];
            }else{
                cnt++;
            }
            
        }
        list.add(cnt);
        int[] answer=list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}