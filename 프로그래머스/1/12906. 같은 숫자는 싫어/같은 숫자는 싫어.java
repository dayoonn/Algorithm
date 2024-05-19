import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        int[] arr_remove=arr;
        int before=-1;
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=before) {
                arr_remove[j++]=arr[i];
                before=arr[i];
            }
        }
        
        int[] answer = Arrays.copyOfRange(arr_remove,0,j);
        
    

        return answer;
    }
}