class Solution {
    public int solution(String t, String p) {
    
        int answer = 0;
        int l=p.length();
        
        int s=0;
        long pNum=Long.parseLong(p);
        
        for(int i=0;i<=t.length()-l;i++){
         
            long tNum=Long.parseLong(t.substring(s,s+l));
            if(tNum<=pNum) answer++;
            s++;
        }
        
        return answer;
    }
}