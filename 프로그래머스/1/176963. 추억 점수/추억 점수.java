import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<yearning.length;i++){
            map.put(name[i],yearning[i]);
        }
        int i=0;
        for(String[] s:photo){
            int sum=0;
            for(String per:s){
                if(map.containsKey(per))sum+=map.get(per);
            }
            answer[i++]=sum;
        }
        
        return answer;
    }
}