import java.util.*;
class Solution {
    public double solution(int[] arr) {
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        
        double answer = sum/(double)arr.length;
        return answer;
    }
}