import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        HashMap<Character,Integer> map=new HashMap<>();
        int num=0;
        for(char c:skill.toCharArray()){
            map.put(c,num++);
        }
        
        
        for(String s:skill_trees){
            int lv=0;
            boolean b=true;
            for(char c:s.toCharArray()){
                if(map.get(c)!=null && map.get(c)==lv){
                    lv++;
                }else{
                    if(map.get(c)!=null) {
                        b=false;
                        break; //순서다르면
                    }
                }
            }
            if(b) answer++;
        }
        return answer;
    }
}