import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[][] students={
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] cnt=new int[3];
        
        for(int i=0;i<answers.length;i++){
            for(int j=0;j<3;j++){
                if(answers[i]==students[j][i%students[j].length]) cnt[j]++;
            }
        }
        
        int max=0;
        for(int c:cnt){
            if(c>max) max=c;
        }
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<3;i++) {
            if(cnt[i]==max) result.add(i+1);
            }
        
        return result.stream().mapToInt(i->i).toArray();
    }
}