import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        HashMap<String,Integer> map=new HashMap<>();
        List<Integer> answer=new ArrayList<>();
        for(String t:terms){
            String[] split=t.split(" ");
            map.put(split[0],Integer.parseInt(split[1]));
        }
        
        int index=1;
        for(String p:privacies){
            String term=p.split(" ")[1];
            String date=p.split(" ")[0];
        
            int days=Integer.parseInt(date.split("\\.")[0])*12*28+(Integer.parseInt(date.split("\\.")[1])+map.get(term))*28+Integer.parseInt(date.split("\\.")[2]);
            
            int todayDays=Integer.parseInt(today.split("\\.")[0])*12*28+Integer.parseInt(today.split("\\.")[1])*28+Integer.parseInt(today.split("\\.")[2]);
           
           
            if(days<=todayDays) answer.add(index);
            index++;
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}