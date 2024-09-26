import java.util.*;

class Solution {
    public long[] solution(long[] numbers) {
        long[] answer= new long[numbers.length];
        
        for(int i=0;i<numbers.length;i++){
            // System.out.println(Long.toBinaryString(numbers[i]));
            char[] bin=Long.toBinaryString(numbers[i]).toCharArray(); //2진수
            boolean b=false;
            int change=0;
            for(int idx=bin.length-1;idx>=0;idx--){
                if(bin[idx]=='0'){
                    b=true;
                    change=idx+1;
                    bin[idx]='1';
                    break;
                }
            }
            String str="";
            if(b && change<=bin.length-1){ 
                bin[change]='0';
                str=new String(bin);
            }else if(!b){
                bin[0]='0';
                str="1"+new String(bin);
            }else{
                str=new String(bin);
            }
            // System.out.println(str);
            answer[i]=Long.valueOf(str,2); //10진수
            
        }       
        return answer;
    }
}