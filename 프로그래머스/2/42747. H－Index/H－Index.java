import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int len=citations.length;
        
        Arrays.sort(citations);
         if(citations[len-1]==0) return 0;
        
        int p=0;
        for(int i=0;i<=len;i++){
            if(citations[p]<i) p++;
            int h=len-p;
            if(h<i || p==len) {
            	answer=i-1;
            	break;
            }
            answer=i;
            
        }

        
       
        return answer;
    }
}