import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<Integer,String> findName=new HashMap<>();
        HashMap<String,Integer> findRank=new HashMap<>();
        int idx=0;
        for(String name:players){
            findName.put(idx,name);
            findRank.put(name,idx++);
        }
        for(String name:callings){
            int nowRank=findRank.get(name);
            String beforeName=findName.get(nowRank-1);
            
            findName.put(nowRank-1,name);
            findRank.put(name,nowRank-1);
            
            findName.put(nowRank,beforeName);
            findRank.put(beforeName,nowRank);
        }
        
        String[] answer = new String[players.length];
        for(int i=0;i<players.length;i++){
            answer[i]=findName.get(i);
        }
        return answer;
    }
}