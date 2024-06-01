class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        //yellow의 y세로 x가로
        for(int y=1;y<=yellow;y++){
            int x;
            if(yellow%y==0) x=yellow/y;
            else continue;
            
           
            if((x*2 + (y+2)*2)==brown){
                answer[0]=x+2;
                answer[1]=y+2;
                break;
            }
        }
        return answer;
    }
}