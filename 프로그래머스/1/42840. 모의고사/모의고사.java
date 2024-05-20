import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        
        int[] st1={1, 2, 3, 4, 5};
        int[] st2={2, 1, 2, 3, 2, 4, 2, 5};
        int[] st3={3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score={0,0,0};
        
        for(int i=0;i<answers.length;i++){
            if(st1[i%5]==answers[i]) score[0]++;
            if(st2[i%8]==answers[i]) score[1]++;
            if(st3[i%10]==answers[i]) score[2]++;
        }
        int max=score[0];
        for(int i=1;i<3;i++){
            if(score[i]>max) max=score[i];
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<3;i++){
            if(max==score[i]) list.add(i+1);
        }
        
        int[] answer=list.stream().mapToInt(Integer::intValue).toArray();
            
        
        
        return answer;
    }
}