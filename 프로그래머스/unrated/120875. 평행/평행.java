class Solution {
    public int solution(int[][] dots) {
        
        double x1=0; double x2=0;
        double y1=0; double y2=0;
        //0.1 / 2.3
        x1=dots[0][0]-dots[1][0];
        y1=dots[0][1]-dots[1][1];
        x2=dots[2][0]-dots[3][0];
        y2=dots[2][1]-dots[3][1];
        if((x1==x2&&y1==y2)||(y1==(x1/x2)*y2)) return 1;
        
        //0.2 / 1.3
        x1=dots[0][0]-dots[2][0];
        y1=dots[0][1]-dots[2][1];
        x2=dots[1][0]-dots[3][0];
        y2=dots[1][1]-dots[3][1];
       if((x1==x2&&y1==y2)||(y1==(x1/x2)*y2)) return 1;
        //0,3 / 1,2
        x1=dots[0][0]-dots[3][0];
        y1=dots[0][1]-dots[3][1];
        x2=dots[1][0]-dots[2][0];
        y2=dots[1][1]-dots[2][1];
        if((x1==x2&&y1==y2)||(y1==(x1/x2)*y2)) return 1;
        
        return 0;
    }
}