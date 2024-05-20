class Solution {
    public int solution(int n) {
        int answer = 1; //2 is prime
        
        for(int i=3;i<=n;i+=2){
            boolean b=true;
            for(int j=3;j<=Math.sqrt(i);j++){
                if(i%j==0) {
                    b=false;
                    break;
            }
        }
            if(b) answer++;
        }
        return answer;
    
}
}