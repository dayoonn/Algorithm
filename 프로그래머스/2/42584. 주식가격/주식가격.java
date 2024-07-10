import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int len=prices.length;
        int[] answer = new int[len];
        int[] keep=new int[10001]; 
        
        answer[len-1]=0;
        keep[prices[len-1]]++;
        int max=prices[len-1];
        int min=prices[len-1];
        
        for(int i=len-2;i>=0;i--){
            max=Math.max(max,prices[i]);
            if(min>=prices[i]){
                for(int j=prices[i];j<=max;j++) answer[i]+=keep[j];
            }else{
                for(int j=i;j<len;j++){
                    if(prices[i]>prices[j]) break;
                    answer[i]++;
                }
            }
            min=Math.min(min,prices[i]);
            
            keep[prices[i]]++;
        }

        return answer;
    }
}