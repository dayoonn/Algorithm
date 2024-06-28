import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        
        List<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        
        for(int i=0;i<str1.length()-1;i++){
            String sub=str1.substring(i,i+2);
            if(sub.matches("[a-zA-Z]+")){
                list1.add(sub);
                //System.out.println(sub);
            }
        }
        for(int i=0;i<str2.length()-1;i++){
            String sub=str2.substring(i,i+2);
            if(sub.matches("[a-zA-Z]+")){
                list2.add(sub);
            }
        }
        
      
        int gyo=0;
        int hap=list1.size()+list2.size();
        
        
        for(String str:list1){
            //hap.add(str);
            if(list2.contains(str)){
                list2.remove(str);
                gyo++;
               // System.out.println(str);
            }
        }
        hap-=gyo;
    
       
        
        
        int answer = (int)((double)gyo/(double)hap*65536);
        
        if(hap==0) answer=1*65536;
        
        
        
        return answer;
    }
    
  
}