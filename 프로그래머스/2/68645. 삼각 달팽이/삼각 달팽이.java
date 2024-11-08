import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[][] map = new int[n][n];
        
        //방향
        int[] dx = {0,+1,-1};
        int[] dy = {+1,0,-1};
        int num =0; //max num
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                num++;
            }
        }
        
        int y = 0; //row
        int x = 0; //col 
        int idx =0; //direction index
        map[0][0]=1;
        for(int i=2;i<=num;i++){
            y+= dy[idx];
            x+= dx[idx];
            
            if(x<0 || x>=n || y<0 || y>=n || map[y][x]!=0 ){
                y-= dy[idx];
                x-= dx[idx]; //복원
                idx = (idx+1)%3; //방향 변화
                y+= dy[idx];
                x+= dx[idx]; //다시 움직임
            }
            map[y][x] = i;
            
        }
        
       
        
        int[] answer = new int[num];
        int z =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                answer[z++]=map[i][j];
            }
        }
        return answer;
    }
}