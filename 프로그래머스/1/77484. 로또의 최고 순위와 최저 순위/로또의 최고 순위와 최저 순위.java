import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer=new int[2];
        HashMap<Integer,Integer> prize=new HashMap<>();
        prize.put(6,1);prize.put(5,2);prize.put(4,3);prize.put(3,4);prize.put(2,5);
        int zero=0; //0개수
        int correct=0; //맞은 개수
        
        boolean[] mine = new boolean[46];
        for(int i:lottos){
            mine[i]=true;
            if(i==0) zero++;
        }
        for(int w:win_nums){
            if(mine[w]) correct++;
        }
       
        int max=correct+zero;//0이 모두 당첨번호인 경우
        int min=correct; //0이 모두 꽝인 경우
        
        if(prize.get(max)!=null) answer[0]=prize.get(max);
        else answer[0]=6;
        
        if(prize.get(min)!=null) answer[1]=prize.get(min);
        else answer[1]=6;
        
        return answer;
    }
}