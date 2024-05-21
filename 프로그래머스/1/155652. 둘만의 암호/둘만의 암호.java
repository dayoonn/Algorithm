import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        boolean[] no=new boolean[26];
        for(char c:skip.toCharArray()){
            no[c-'a']=true;
        }
        for(char c:s.toCharArray()){
            char al=(char)(c+1);
            int i=0;
            while(i<index){
                if(!no[(al-'a')%26]){
                    i++;
                }  
                System.out.println(al);
                al=(char)(al+1);
                
            }
         
            char after=(char)((al-1-'a')%26+'a');
            answer+=after;
        }
           return answer;
           
          
        }
       
       
    
}