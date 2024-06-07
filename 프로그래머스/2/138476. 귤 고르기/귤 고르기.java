import java.util.*;
import java.util.Collections.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        boolean[] visited=new boolean[10000001];
        List<Integer> cnt= new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int index=0;
        for(int i:tangerine){
            if(!visited[i]){
                map.put(i,index++);
                visited[i]=true;
                cnt.add(0);
            }
            int numIdx=map.get(i);
            int before=cnt.get(numIdx);
            cnt.set(numIdx,++before);
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