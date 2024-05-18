class Solution {
    public String solution(String phone_number) {
        int len=phone_number.length();
        String substr="*".repeat(len-4);
        
        String answer = substr+phone_number.substring(len-4,len);
        return answer;
    }
}