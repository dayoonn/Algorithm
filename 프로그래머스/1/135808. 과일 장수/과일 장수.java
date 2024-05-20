import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
         int answer = 0;
        int box=score.length/m;
        Arrays.sort(score);
        int maxApple=score.length-1;
        for(int i=0;i<box;i++){
            int minApple=score[maxApple-m+1];
            answer+=minApple*m;
            maxApple-=m;
        }
       
        
        return answer;
    }
}