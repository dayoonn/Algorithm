import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<want.length;i++) map.put(want[i],number[i]);
        
        //초기 10일
        for(int i=0;i<10;i++){
            String item=discount[i];
            if(map.get(item)!=null) map.put(item,map.get(item)-1);
            answer+=check(map,want);
        }
        
        //11일~마지막날
        for(int i=10;i<discount.length;i++){
            String item=discount[i];
            String out=discount[i-10];
            if(map.get(item)!=null) map.put(item,map.get(item)-1);
            if(map.get(out)!=null) map.put(out,map.get(out)+1);
            answer+=check(map,want);
        }
        
        return answer;
    }
    public int check(HashMap<String,Integer> map, String[] want){
        for(String w:want){
            if(map.get(w)>0) return 0;
        }
        return 1;
    }
}