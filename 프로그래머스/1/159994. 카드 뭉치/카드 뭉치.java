import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        List<String> c1=new ArrayList<>(Arrays.asList(cards1));
        List<String> c2=new ArrayList<>(Arrays.asList(cards2));
        
        String answer = "Yes";
        for(int i=0;i<goal.length;i++){
            if(!c1.isEmpty()&&c1.get(0).equals(goal[i])) c1.remove(0);
            else if(!c2.isEmpty()&&c2.get(0).equals(goal[i]))c2.remove(0);
            else{
                answer="No";
                break;
            }
        }
        return answer;
    } 
}