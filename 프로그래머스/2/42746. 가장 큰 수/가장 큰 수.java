import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] numStr=new String[numbers.length];
        
        for(int i=0;i<numbers.length;i++){
           numStr[i]=Integer.toString(numbers[i]);
        }
        
        Arrays.sort(numStr,(s1,s2)->(s2+s1).compareTo(s1+s2)); //문자열을 붙여서 비교. 내림차순
       
        for(String a:numStr){
            answer+=a;
        }
        
        if(answer.replace("0","")=="")answer="0";
        return answer;
    
    }
}