class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        if(a>b){
            int tmp=a;
            a=b;
            b=tmp;
        }
        
        int nextA=a;
        int nextB=b;
        while(nextA!=nextB){
            nextA=(nextA+1)/2;
            nextB=(nextB+1)/2;
            answer++;
        }
        

        return answer;
    }
}