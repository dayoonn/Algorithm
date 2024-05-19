import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
        HashSet<Integer> set=new HashSet<>();
        
        int s=0;
        int e=0;
        while(s<numbers.length-1){
            set.add(numbers[s]+numbers[++e]);
            if(e==numbers.length-1){
                s++;
                e=s;
            }
        }
        int[] answer=new int[set.size()];
        int j=0;
        for(Integer i:set) {answer[j++]=i;}
        Arrays.sort(answer);
        return answer;
    }
}