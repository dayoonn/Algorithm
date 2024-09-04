import java.util.*;

class Solution {
    public List<String> solution(String[] record) {
    
        List<String> answer=new ArrayList<>();
        Map<String,String> map=new HashMap<>();
        
        //닉네임 찾기
        for(String msg:record){
            if(msg.charAt(0)=='L'){ //방을 나가면 pass
                continue;
            }else{
                String[] str=msg.split(" ");
                // System.out.println(str[0]);
                map.put(str[1],str[2]); //id,nickname
            }
        }
        
        //기록 처리
        for(String msg:record){
            String[] str=msg.split(" "); 
            String result=map.get(str[1])+"님이";
            
            if(str[0].equals("Enter")){
                result+=" 들어왔습니다.";
            }else if(str[0].equals("Leave")){
                result+=" 나갔습니다.";
            }else{// Change
                continue;
            }
            
            answer.add(result);
        }
        
        return answer;
    }
}