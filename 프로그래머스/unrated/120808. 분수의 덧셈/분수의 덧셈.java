class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int d=denom1*denom2;
        int n=numer1*denom2+numer2*denom1;
        
        int max= (d>n)? d:n;
        
        for(int i=max/2;i>1;i--){
            if(d%i==0&&n%i==0){
                d/=i;
                n/=i;
            }
        }
        int[] answer = {n,d};
        return answer;
    }
}