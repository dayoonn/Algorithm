import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        boolean[][] garo=new boolean[11][10];
        boolean[][] sero=new boolean[10][11];
        
        int x=0;
        int y=0;
        
        for(char c:dirs.toCharArray()){
            if(c=='U'){
                if(y>=5) continue;
                y++;
                if(!sero[5-y][x+5]){
                    answer++;
                    sero[5-y][x+5]=true;
                }
            }else if(c=='D'){
                if(y<=-5) continue;
                if(!sero[5-y][x+5]){
                    answer++;
                    sero[5-y][x+5]=true;
                }
                y--;
            }else if(c=='R'){
                if(x>=5) continue;
                if(!garo[5-y][x+5]){
                    answer++;
                    garo[5-y][x+5]=true;
                }
                x++;
            }else{//L
                if(x<=-5) continue;
                x--;
                if(!garo[5-y][x+5]){
                    answer++;
                    garo[5-y][x+5]=true;
                }
                
            }
        }
      
        return answer;
    }
}