class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max=m;
        int min=n;
        
        if(n>m){
            max=n;
            min=m;
        }
        //최대 공약수
        for(int i=min;i>=1;i--){
            if(min%i==0 && max%i==0) {
                answer[0]=i;
                break;
            }
        }
        //최소 공배수
        answer[1]=max*min/answer[0];
        return answer;
    }
}