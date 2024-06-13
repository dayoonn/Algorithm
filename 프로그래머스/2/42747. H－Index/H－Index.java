import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int len=citations.length;
        int answer = 0;
       
       for(int i=0;i<len;i++){
           int h=citations[i];
           int cnt=len-i;
           
          // System.out.println("h : "+h+"cnt : "+ cnt);
           if(cnt==h) return h;
           if(cnt<h){
               //System.out.println(h);
               
               for(int j=h-1;j>=0;j--){
                   if(j==cnt){
                       answer=j;
                       return j;
                   }
               }
           }
       }
        
        
        return answer;
    }
}