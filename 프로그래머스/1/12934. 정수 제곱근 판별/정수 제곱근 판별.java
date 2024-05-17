class Solution {
    public long solution(long n) {
        long answer = 0;
        double double_sq=Math.sqrt(n);
        long int_sq=(long)double_sq;
        
        if(double_sq%(double)int_sq==0)answer=(int_sq+1)*(int_sq+1);
        else answer=-1;
        
      //  System.out.println();
        
        return answer;
    }
}