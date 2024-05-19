import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
         
            if(Character.isLetter(c)){
               if(c>='a'&&c<='z'){
                   if(c+n>'z'){
                   c=(char)((c+n)%'z'+'a'-1);}
                   else c+=n;
                   answer+=String.valueOf(c);
               }
                else if(c>='A'&&c<='Z'){
                    if(c+n>'Z'){
                   c=(char)((c+n)%'Z'+'A'-1);}
                    else c+=n;
                   answer+=String.valueOf(c);
               }
            
        }
            else{
                answer+=String.valueOf(c);
            }
        
    }
        return answer;
}
    
}