import java.util.*;

class Solution {

    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String,Integer> map=new HashMap<>();
        
        for(String[] c:clothes){
            map.put(c[1],map.getOrDefault(c[1],0)+1);
        }
        
    
       
        int idx=0;
        for(String a:map.keySet()){
            answer*=map.get(a)+1;
        }
       

        return answer-1; //아무것도 입지 않은 수
        
    }

}