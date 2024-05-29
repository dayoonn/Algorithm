import java.util.*;
class Solution {
    public int[] solution(String s) {
        
        int trans=0;
        int cnt=0;
        
      
        while(s.length()>1){
            
            int orig=s.length();
            s=s.replace("0","");
            int now=s.length();
           
            cnt+=orig-now;
            //2진수 변환
            trans++;
            s="";
            boolean b=true;
            while(b){
                if(now==0) break;
                s=Integer.toString(now%2)+s;
                now=now/2;
            }
            
           
        }
        int[] answer={trans,cnt};
        return answer;
    }
}