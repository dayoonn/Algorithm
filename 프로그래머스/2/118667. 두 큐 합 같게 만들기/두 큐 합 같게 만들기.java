import java.util.*;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        
        //sum
        long sum1=0;
        long sum2=0;
        int len = queue1.length;
        int[] q = new int[len*2]; //전체 담을 배열
        for(int i=0;i<len;i++){
            sum1+=queue1[i];
            sum2+=queue2[i];
            
            q[i]=queue1[i];
            q[i+len]=queue2[i];
        }
        long goal=(sum1+sum2)/2;
        
        if((sum1+sum2)%2!=0) return -1;//홀수이면 불가
        else if(sum1==sum2) return 0; //잘 나뉘어져있으면 0
        
        int p1=0; //q1포인터
        int p2=len;//q2포인터
        
        for(int i=0;i<=len*2+1;i++){
            if(sum1>sum2){
                answer++;
                sum1-=q[p1];
                sum2+=q[p1];
                p1++;
                p1%=len*2;
            }else{
                answer++;
                sum2-=q[p2];
                sum1+=q[p2];
                p2++;
                p2%=len*2;
            }
            
            if(sum1==sum2) return answer;
            
        }
        
        
        return -1; 
    }
}