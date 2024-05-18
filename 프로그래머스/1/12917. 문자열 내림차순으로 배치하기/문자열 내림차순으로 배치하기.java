import java.util.*;
class Solution {
    public String solution(String s) {
        List<String> list=new ArrayList<>(Arrays.asList(s.split("")));
        Collections.sort(list);
        Collections.reverse(list);
        
        String answer = String.join("",list);
        return answer;
    }
}