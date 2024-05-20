import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int[] cnt=new int[4];
        int index=0;
        for(int i=0;i<dartResult.length();i++){
           
            char c=dartResult.charAt(i);
            if(Character.isDigit(c)){
                index++;
                if(Character.isDigit(dartResult.charAt(i+1))) {
                    cnt[index]=10;
                  i+=1;
                }
                else cnt[index]=c-'0';
            }else if(Character.isLetter(c)){
                
                if(c=='S') cnt[index]=(int)Math.pow(cnt[index],1);
                else if(c=='D') cnt[index]=(int)Math.pow(cnt[index],2);
                else if(c=='T') cnt[index]=(int)Math.pow(cnt[index],3);
            }else{
                if(c=='*'){
                    cnt[index-1]*=2;
                    cnt[index]*=2;
                }else if(c=='#'){
                    cnt[index]*=-1;
                }
            }
        }
        
        for(int i:cnt) answer+=i;
        
        return answer;
    }
}