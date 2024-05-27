import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = new_id.toLowerCase();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<answer.length();i++){
            char c=answer.charAt(i);
            if((c=='-'||c=='_'||c=='.'||(c>='a'&&c<='z')||(c>='0'&&c<='9'))){
                
                if(c=='.'&&sb.length()>0&&sb.charAt(sb.length()-1)=='.') continue;
                sb.append(c);
                
            }
        }
        if(sb.charAt(0)=='.') sb.delete(0,1);
        if(sb.length()>0&&sb.charAt(sb.length()-1)=='.') sb.delete(sb.length()-1,sb.length());
        
        if(sb.length()==0) sb.append("a");
        if(sb.length()>=15) sb.delete(15,sb.length());
        if(sb.charAt(sb.length()-1)=='.') sb.delete(sb.length()-1,sb.length());
        if(sb.length()<=2){
            int l=sb.length();
            for(int i=0;i<3-l;i++) sb.append(sb.charAt(l-1));
        }
        return sb.toString();
    }
}