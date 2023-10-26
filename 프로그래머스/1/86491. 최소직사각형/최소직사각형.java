class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int l=0;//더 긴거
        int s=0;
        
        int max_l=0; //긴 것중에 제일 긴거
        int max_s=0; //짧은 것 중에 제일 긴거
        
        for(int[] set:sizes){
            if(set[0]>=set[1]){
                l=set[0];
                s=set[1];
            }else{
                l=set[1];
                s=set[0];
            }
            if(max_l<l) max_l=l;
            if(max_s<s) max_s=s;
        }
        answer=max_l*max_s;
        return answer;
    }
}