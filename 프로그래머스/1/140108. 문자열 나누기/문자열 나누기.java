class Solution {
    public int solution(String s) {
        int answer = 0;
        
        
        int i=0;
        while(s.length()>0){
            int same=0;
            int diff=0;
            char c=s.charAt(i++);
            same++;
            while(same!=diff && i<s.length()){
                char next=s.charAt(i++);
                if(next==c) same++;
                else diff++;
            }
            answer++;
            s=s.substring(i);
            i=0;
            
        }
        
        return answer;
    }
}