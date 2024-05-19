import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLetter(c)) {
                if (c >= 'a' && c <= 'z') {
                  
                        c = (char) ((c -'a'+n) % 26 + 'a');
                   
                    answer += String.valueOf(c);
                } else if (c >= 'A' && c <= 'Z') {
                    
                        c = (char) ((c -'A'+n) % 26 + 'A');
                   
                    answer += String.valueOf(c);
                }

            } else {
                answer += String.valueOf(c);
            }

        }
        return answer;
    }

}