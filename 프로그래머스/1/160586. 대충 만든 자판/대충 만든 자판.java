import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] cnt=new int[keymap.length];
        
        for(int t=0;t<targets.length;t++){
            for(int i=0;i<targets[t].length();i++){
                char c=targets[t].charAt(i);
               
                for(int j=0;j<keymap.length;j++){
                    if(keymap[j].indexOf(c)!=-1) cnt[j]=keymap[j].indexOf(c)+1;
                    else cnt[j]=101;
                }
                Arrays.sort(cnt);
                if(cnt[0]==101){
                    answer[t]=-1;
                    break;
                }else{
                    answer[t]+=cnt[0];
                }
            }
        }
        
        return answer;
    }
}