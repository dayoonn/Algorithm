import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String word:babbling){
            word=word.replace("aya","0");
            word=word.replace("ye","1");
            word=word.replace("woo","2");
            word=word.replace("ma","3");      
            boolean b=true;
            for(int i=0;i<word.length();i++){
                
                if(!Character.isDigit(word.charAt(i))){
                    b=false;
                    break;
                }
                if(i>0&&word.charAt(i-1)==word.charAt(i)){
                    b=false;
                    break;
                }
                
            }
            if(b) answer++;
            
        }
        
       
        return answer;
    }
}