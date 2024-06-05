import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashSet<String> set=new HashSet<>();
        String before=""+words[0].charAt(0);
        
        for(int i=0;i<words.length;i++){
            if(words[i].charAt(0)!=before.charAt(before.length()-1)){
                answer[0]=i%n+1;
                answer[1]=i/n+1;
                break;
            }
            before=words[i];
            int size=set.size();
            set.add(words[i]);
            if(size==set.size()){ //중복
                answer[0]=i%n+1;
                answer[1]=i/n+1;
                break;
            }
        }
        
       

        return answer;
    }
}