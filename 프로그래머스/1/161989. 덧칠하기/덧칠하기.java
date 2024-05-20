import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        StringBuilder sb=new StringBuilder("o".repeat(n));
        for(int w:section) sb.setCharAt(w-1,'x');
        String wall=sb.toString();
        
        while(wall.indexOf('x')!=-1){
             int index=wall.indexOf('x');
             if(index>=n-m){
                 answer++;
                 break;
             }
             wall=wall.substring(0,index)+"o".repeat(m)+wall.substring(index+m);
             answer++;
         }
        
        // for(int w:section){
        //     if(wall.charAt(w-1)=='x'){
        //         if(w<n-m+1) wall.replace(w-1,w+m-1,"o".repeat(m));
        //         answer++;
        //     }
        // }
        
        return answer;
    }
}