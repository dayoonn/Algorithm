class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
    
        for(int kisa=1;kisa<=number;kisa++){
            int num=0; //약수개수
            for(int p=1;p<=Math.sqrt(kisa);p++){
                if(kisa%p==0){
                    num+=2;
                }
            }
            if(Math.sqrt(kisa)==(int)Math.sqrt(kisa)) num-=1;
            
            if(num>limit) answer+=power;
            else answer+=num;
        }
        return answer;
    }
}