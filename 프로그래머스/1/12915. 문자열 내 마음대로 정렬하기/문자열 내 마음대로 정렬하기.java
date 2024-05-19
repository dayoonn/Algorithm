import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        Arrays.sort(strings); //사전순 배치
        Arrays.sort(strings,
                    (s1,s2)->{
                        return s1.charAt(n)-s2.charAt(n);
                    }); //n번째 글자 순 배치
        
        return strings;
    }
}