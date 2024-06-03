import java.util.*;

class Solution {
      
        
        static int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

       
        static int lcm(int a, int b) {
            return a * (b / gcd(a, b));
        }
    
    public int solution(int[] arr) {
       int answer = 1;
      

        
        for (int i = 0; i < arr.length; i++) {
            answer = lcm(answer, arr[i]);
        }
        
        return answer;
    }
}