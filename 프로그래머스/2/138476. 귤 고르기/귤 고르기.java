import java.util.*;
import java.util.Collections.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
       // boolean[] visited=new boolean[10000001];
        HashMap<Integer,Integer> map=new HashMap<>();
        //int index=0;
        for(int i:tangerine){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        List<Integer> cnt= new ArrayList<>();
        for(Integer key:map.keySet()){
            cnt.add(map.get(key));
        }
        
        Collections.sort(cnt, Collections.reverseOrder());
        int sum=0;
        for(int i=0;i<cnt.size();i++){
            sum+=cnt.get(i);
            if(sum>=k){
                answer=i+1;
                break;
            }
        }
       
        
        
        return answer;
    }
}