import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        //f(1)=1
        //f(2)=1+1=2
        //f(3)=f(1)+f(2)=3
        
        int[] arr=new int[n+1];
        arr[1]=1;
        arr[2]=2;
        
        for(int i=3;i<=n;i++){
            arr[i]=(arr[i-1]+arr[i-2])%1000000007;
        }
        answer=arr[n];
        
        
        return answer;
    }
}