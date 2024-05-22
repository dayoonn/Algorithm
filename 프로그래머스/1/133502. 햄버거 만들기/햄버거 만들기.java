import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        List<Integer> list=new ArrayList<>();
        for(int i:ingredient){
            list.add(i);
           
            int len=list.size();
          
            if(len>3){
                if(list.get(len-1)==1 && 
                  list.get(len-2)==3&&
                  list.get(len-3)==2&&
                  list.get(len-4)==1){
                    answer++;
                for(int r=len-1;r>=len-4;r--) list.remove(r);
                }
            }
        }
        
        return answer;
    }
}