import java.util.*;
class Solution {
    public String solution(String s) {
       
        
        StringBuilder sb=new StringBuilder(s);
        //System.out.println("sb");
        int j=0;
        
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==' '){j=0;}
            else {
                    if(j%2==0){
                     sb.setCharAt(i,Character.toUpperCase(sb.charAt(i))); 
                    }
                else{
                    sb.setCharAt(i,Character.toLowerCase(sb.charAt(i))); 
                }
                    j++;
            }
        }
         String answer = sb.toString();
        return answer;
    }
}