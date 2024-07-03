import java.util.*;

class Solution {
    public int solution(int n, int k) {
        
        int answer = 0;
        long num=0;
        int jari=0;
        
        while(n!=0){
            int remain=n%k;
            num=num+(long)Math.pow(10,jari++)*remain;
            n=n/k;
            
            if(remain==0||n==0){
                answer+=isPrime(num);
                jari=0;
                num=0;
            }
        }
        
        return answer;
    }
    
    public int isPrime(long num){
        if(num==1||num==0) return 0;
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0) return 0;
        }
        return 1;
    }
}