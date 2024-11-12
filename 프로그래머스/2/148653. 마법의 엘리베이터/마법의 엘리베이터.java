import java.util.*;

class Solution {
    public int solution(int storey) {
        int answer = 0;
        String s = Integer.toString(storey);
       
        while(storey!=0){
            int num = storey % 10; //마지막 자리수
            int remind = 10-num ;
            if(num>=6){
                answer+=remind;
                storey+=remind;
            }else if(storey>=10 && num==5){
                if(storey%100/10 >=5) {
                    answer+=remind;
                    storey+=remind;
                }else{
                    answer+=num;
                    storey-=num;
                }
            }else{
                answer+=num;
                storey-=num;
            }
            storey/=10; //마지막 자리수 버림
                
        }
        
        return answer;
    }
}