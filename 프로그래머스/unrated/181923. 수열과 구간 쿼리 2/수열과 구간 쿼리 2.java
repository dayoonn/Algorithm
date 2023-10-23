
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0;i<queries.length;i++){
            int[] q=queries[i];
            int s=q[0];
            int e=q[1];
            int k=q[2];
            
            List<Integer> list=new ArrayList<>();
            for(int j=s;j<=e;j++) list.add(arr[j]);
            Collections.sort(list);
            
            for(int l:list){
                if(l>k) {
                    answer[i]=l;
                    break;
                }
                else answer[i]=-1;
            }
            
        }
        
        
        return answer;
    }
}