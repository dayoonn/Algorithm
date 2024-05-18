class Solution {
    public int solution(int num) {
        int cnt=0;
        long longNum=(long)num;
        while(longNum!=1){
            cnt++;
            if(longNum%2==0) longNum/=2;
            else longNum=longNum*3+1;
            
            if(cnt==500) {
                cnt=-1;
                break;
        }
        
    }
        return cnt;
}
}