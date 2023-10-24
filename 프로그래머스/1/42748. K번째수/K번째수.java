import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cnt=0;
        for(int[] c:commands){
            int i=c[0];
            int j=c[1];
            int k=c[2];
            
            int[] cut=Arrays.copyOfRange(array,i-1,j);
            Arrays.sort(cut);
           
            answer[cnt]=cut[k-1];
            cnt++;
        }
        
        return answer;
    }
}