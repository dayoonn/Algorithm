import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String nStr=Integer.toBinaryString(n);
        nStr=nStr.replace("0","");
        
        while(true){
            String nextStr=Integer.toBinaryString(++n);
            nextStr=nextStr.replace("0","");
            if(nStr.length()==nextStr.length()){
                answer=n;
                break;
            }
        }
        
        return answer;
    }
}