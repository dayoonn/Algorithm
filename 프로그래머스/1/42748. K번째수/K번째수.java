import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
     
        int j=0;
        for(int[] c:commands){
            int[] arr=Arrays.copyOfRange(array,c[0]-1,c[1]);
           
            Arrays.sort(arr);
          
            answer[j++]=arr[c[2]-1];
           
        }
        return answer;
    }
}