class Solution {
    public int solution(int n) {
        
        int a=0;
        int b=1;
        int now=0; 
        for(int i=2;i<=n;i++){
            now=(a+b)%1234567;
            a=b;
            b=now;
            
        }
        
        return now;
    }
}