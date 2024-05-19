import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        String p1="";
        for(int i=1;i<food.length;i++){
            p1+=Integer.toString(i).repeat(food[i]/2);
        }
        StringBuilder p2=new StringBuilder(p1);
        p2.reverse();
        answer+=p1+"0"+p2;
        
        return answer;
    }
}