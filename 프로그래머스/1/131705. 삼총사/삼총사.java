import java.util.*;

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        HashSet<List<Integer>> set=new HashSet<>();
        
        Arrays.sort(number);
        int x=number.length-1; //뒤부터
        
        for(int i=0;i<number.length;i++){
            int s=0;
            int e=1;
            int n=number[x];
            
            while(e<x){
                int sum=number[s]+number[e];
                if(sum+n==0){
                    answer++;
                }
                e++;
                if(e>=x){
                    s++;
                    e=s+1;
                }
            }
            x--;
        }
        
        
        return answer;
    }
}