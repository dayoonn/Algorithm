import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int[] days={0,31,29,31,30,31,30,31,31,30,31,30,31};
        HashMap<Integer,String> map=new HashMap<>();
        map.put(0,"FRI"); map.put(1,"SAT"); map.put(2,"SUN");
        map.put(3,"MON"); map.put(4,"TUE"); map.put(5,"WED"); map.put(6,"THU");
        int pass=-1; //1월 1일로 부터 지난 날
        for(int i=0;i<a;i++){
            pass+=days[i];
        }
        pass+=b;
        answer=map.get(pass%7);
        
        return answer;
    }
}