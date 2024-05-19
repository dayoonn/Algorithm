import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        
        HashMap<String,Integer> map=new HashMap<>();
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        map.put("five",5);
        map.put("six",6);
        map.put("seven",7);
        map.put("eight",8);
        map.put("nine",9);
        
        int p=0;
        int q=p+3;
        
        Set<String> keySet=map.keySet();
        for(String key:keySet){
            s=s.replace(key,map.get(key).toString());
        }
        
        answer=Integer.parseInt(s);
        
        return answer;
    }
}