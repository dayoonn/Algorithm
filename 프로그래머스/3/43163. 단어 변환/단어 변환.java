import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        int n=words[0].length();
        Queue<String> q=new LinkedList<>();
        if(!Arrays.asList(words).contains(target)) return 0;
        
        for(int i=0;i<words.length;i++) q.add(words[i]);

        while(!q.isEmpty()){
            String str=q.poll();
            
            int diff=0;
            for(int i=0;i<n;i++){  
                if(target.charAt(i)!=begin.charAt(i)) diff++;
                if(diff>=2)break;
            }
            if(diff<=1) {
                answer++;
                break;
            }
            
            diff=0;
            boolean b=true;
            for(int i=0;i<n;i++){  
                if(str.charAt(i)!=begin.charAt(i)) diff++;
                if(diff>=2){
                    q.add(str);
                    b=false;
                    break;
                }
            }
            if(diff<=1) {
                System.out.println(begin + "->" +str);
                begin=str;
                answer++;
             }

            
        }
        
        return answer;
    }
}