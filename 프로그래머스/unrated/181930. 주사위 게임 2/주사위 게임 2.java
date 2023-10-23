import java.lang.*;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a==b){
            if(b==c){ //모두 같음
               answer= (a + b + c) * (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2))*(int)(Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3) );
            }else if(b!=c){//두개만 같음
                answer=(a + b + c) * (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2) );
            }
        }else if(a!=b){
            if(b==c){//두개만 같음
                 answer=(a + b + c) * (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2) );
            }else if(b!=c){
                if(a==c){//두개만 같음
                     answer=(a + b + c) * (int)(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2) );
                }else{//모두 다름
                    answer=a+b+c;
                }
            }
        }
        
        return answer;
    }
}