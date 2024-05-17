import java.util.*;
class Solution {
    public long solution(long n) {
        List<String> list=new ArrayList<>();
        list=Arrays.asList(Long.toString(n).split(""));
        Collections.sort(list, Collections.reverseOrder());
        
        long answer = Long.parseLong(String.join("",list));
        return answer;
    }
}