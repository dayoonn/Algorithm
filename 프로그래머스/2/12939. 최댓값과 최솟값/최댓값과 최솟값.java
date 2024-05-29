import java.util.*;
import java.util.stream.*;
class Solution {
    public String solution(String s) {
        
        String[] strArr=s.split(" ");
        List<Integer> list=Arrays.stream(strArr).map(Integer::parseInt).collect(Collectors.toList());
        
        String answer = Collections.min(list)+" "+Collections.max(list);
        return answer;
    }
}