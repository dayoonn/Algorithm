import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list=new ArrayList<>();
        if(score.length<k) k=score.length;
        for(int i=0;i<k;i++){
        
            list.add(score[i]);
            Collections.sort(list); 
            answer[i]=list.get(0);
        }
       
        for(int i=k;i<score.length;i++){
            list.add(score[i]);
            Collections.sort(list);
            answer[i]=list.get(list.size()-k);
            
        }
        return answer;
    }
}