class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(String s:babbling){
            s=s.replaceFirst("aya","*");
            s=s.replaceFirst("ye","*");
            s=s.replaceFirst("woo","*");
            s=s.replaceFirst("ma","*");
            s=s.replace("*","");
            if(s.length()==0) answer++;
        }
        return answer;
    }
}