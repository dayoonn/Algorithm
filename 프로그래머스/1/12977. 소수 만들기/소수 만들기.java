class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        int s=0;
        int m=s+1;
        int e=m+1;
        while(s<=nums.length-3){
            int num=nums[s]+nums[m]+nums[e];
         
            if(isPrime(num)) answer++; 
            e++;
            if(e>nums.length-1){
                m++;
                e=m+1;
                if(m>nums.length-2){
                    s++;
                    m=s+1;
                    e=m+1;
                }
            }
            
        }

        return answer;
    }
    
    public static boolean isPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}