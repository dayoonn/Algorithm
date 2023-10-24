class Solution {
    public int solution(int[][] board) {
      
        int danger=0;
        int len=board.length;
        int answer = len*len;
        int[] dx={-1,0,+1,-1,+1,-1,0,+1};
        int[] dy={+1,+1,+1,0,0,-1,-1,-1};
        
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(board[i][j]==1){
                    danger++;
                    for(int d=0;d<8;d++){
                        int x=j+dx[d];
                        int y=i+dy[d];
                        if(checked(x,y,len)){
                            if(board[y][x]==0){
                                danger++;
                                board[y][x]=2;
                            }
                        }
                    }
                    
                }
            }
        }
        answer-=danger;
        return answer;
    }
    
    public boolean checked(int x,int y,int len){
        if(x<0||x>=len||y<0||y>=len) return false;
        else return true;
    }
}