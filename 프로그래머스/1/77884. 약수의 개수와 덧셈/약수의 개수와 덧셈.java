class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int n=left;n<=right;n++){ //숫자 범위
            int cnt=0; //약수개수
            for(int i=1;i<=n;i++){ //약수
                if(n%i==0) cnt++;
            }
            if(cnt%2==0) answer+=n;
            else answer-=n;
        }
        
       
        return answer;
    }
}