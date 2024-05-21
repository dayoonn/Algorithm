import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<participant.length;i++){
            map.put(participant[i],i);
        }
        int[] cnt=new int[participant.length];
        for(String player:participant) cnt[map.get(player)]++;
        for(String com:completion) cnt[map.get(com)]--;
        String answer="";
        Set<String> keySet=map.keySet();
        for(int i=0;i<cnt.length;i++){
            if(cnt[i]!=0){
                for(String key:keySet){
                    if(map.get(key).equals(i)){
                        answer=key;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}