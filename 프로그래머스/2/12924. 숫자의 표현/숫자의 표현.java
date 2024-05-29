class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] A=new int[n+1]; //0~n
        for(int i=1;i<A.length;i++) A[i]=i;
        int s=0;
        int e=1;
        int sum=A[s]+A[e];
        while(!(e>n)){
            if(sum<n){
                e++;
                if(e>n) break;
                sum+=A[e];
            }else if(sum>n){
                sum-=A[s];
                s++;
            }else if(sum==n){
               
                answer++;
                sum-=A[s]; s++;
                e++; if(e>n) break; 
                sum+=A[e];
                
            }
        }
        
        
        return answer;
    }
}