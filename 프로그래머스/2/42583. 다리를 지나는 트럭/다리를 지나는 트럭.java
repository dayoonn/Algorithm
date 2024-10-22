import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int sum=0;
        Queue<Integer> q=new LinkedList<>();
        
        for(int i=0;i<bridge_length;i++){
            q.add(-1);
        }
       
        int p=0;
        int cnt=10;
        while(q.size()>0){
            time++;
            
            //poll
            int out = q.poll();
            if(out!=-1) sum-=out;
            
            //add
            if(p<truck_weights.length){
                int in = truck_weights[p];
                if(sum+in <= weight ){
                    q.add(in);
                    sum+=in;
                    p++;
                }else{
                    q.add(-1);
                }
            }
            
            
        }
        
        
        return time;
    }
}