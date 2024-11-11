class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        
        int s = 0;
        int e = 0;
        int sum = sequence[s];
        int diff = 1000000; //max difference
        
        while(e < sequence.length){
            if(sum < k ){
                e++;
                if(e < sequence.length)
                    sum+=sequence[e];
            }else if(sum > k){
                sum -= sequence[s];
                s++;
            }else{
                int nowDiff = e-s;
                if(nowDiff<diff){
                    diff=nowDiff;
                    answer[0]=s;
                    answer[1]=e;
                }
                sum-=sequence[s];
                s++;
            }
        }
        
        return answer;
    }
}