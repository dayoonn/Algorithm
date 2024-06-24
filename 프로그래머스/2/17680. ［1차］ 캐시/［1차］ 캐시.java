import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> que=new LinkedList<>();
        HashMap<String,Integer> map=new HashMap<>();
        if(cacheSize==0){
            answer=cities.length*5;
            return answer;
        }
        for(String c:cities){
            String city=c.toLowerCase();
         
            if(map.get(city)!=null && map.get(city)==1){ //캐쉬에 있으면
               
                String start=que.peek();
                
                while(!que.isEmpty()){
                    String find=que.poll();
                    if(!find.equals(city)) que.offer(find);
                    if(start.equals(city)) break;
                    if(que.peek().equals(start)) break;
                }
                que.offer(city);
                map.put(city,1);
                answer+=1; //hit
                
                
            }
            else{ //사이즈 초과
               
                if(que.size()>=cacheSize){
                    map.put(que.poll(),0);
                    map.put(city,1);
                    que.offer(city);
                    answer+=5; //miss
                  
                 }
                 else{
                    map.put(city,1);
                    que.offer(city);
                    answer+=5; //miss
                 
            }
             }
           
         }
        
        return answer;
    }
}