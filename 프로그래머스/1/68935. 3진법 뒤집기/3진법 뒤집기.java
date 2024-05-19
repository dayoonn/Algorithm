class Solution {
    public int solution(int n) {
        int answer = 0;
        String base3_reverse="";
        
        while(n>=3){
            base3_reverse+=n%3;
            n/=3;
        }
        base3_reverse+=n;
        
        int p=base3_reverse.length()-1;
        
        for(int i=0;i<base3_reverse.length();i++){
            answer+=Math.pow(3,p--)*(base3_reverse.charAt(i)-'0');
        }
        
        return answer;
    }
}