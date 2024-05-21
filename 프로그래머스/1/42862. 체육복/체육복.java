import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
         
        //Arrays.sort(lost);Arrays.sort(reserve);
        StringBuilder have = new StringBuilder("1".repeat(n)); 
        for(int l:lost) have.setCharAt(l-1,'0');
        for(int r:reserve) {
            if(have.charAt(r-1)=='0')have.setCharAt(r-1,'1');
            else have.setCharAt(r-1,'2');
        }
        
        System.out.println(have);
        String str=have.toString();
        String findzero=str.replace("1","");
        if(!findzero.isEmpty()&&findzero.charAt(0)=='0'){
            str=str.replace("02","11");
            str=str.replace("20","11");
        }
        else{
            str=str.replace("20","11");
            str=str.replace("02","11");
        
        }
        str=str.replace("2002","1111");
        str=str.replace("2020","1111");
        str=str.replace("0202","1111");
       
        
        
        System.out.println(str);
        
        int answer = n;
        for(char c:str.toCharArray()){
            if(c=='0')answer--;
        }
        return answer;
    }
}