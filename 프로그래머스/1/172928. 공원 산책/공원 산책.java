import java.util.*;
class Solution {
    public int[] solution(String[] park, String[] routes) {
        int len=park.length;
        int[][] arr=new int[len][park[0].length()];
        int[] loc=new int[2];//현재위치
        
        for(int i=0;i<len;i++){
            for(int j=0;j<park[0].length();j++){
                if(park[i].charAt(j)=='X') arr[i][j]=1;
                else {
                    arr[i][j]=0;
                    if(park[i].charAt(j)=='S'){
                        loc[0]=i;
                        loc[1]=j;
                    }
                }
                
            }
        }
        
        for(String r:routes){
            String dir=r.split(" ")[0];
            int move=Integer.parseInt(r.split(" ")[1]);
            int row=loc[0];
            int col=loc[1];
            if(dir.equals("E")) col+=move;
            else if(dir.equals("W")) col-=move;
            else if(dir.equals("S")) row+=move;
            else if(dir.equals("N")) row-=move;
            
            if(row>=0 && row<len && col>=0 && col<park[0].length()){
                int rowMax=loc[0]; int rowMin=row;
                if(loc[0]<row){
                    rowMax=row;rowMin=loc[0];
                }
                int colMax=loc[1]; int colMin=col;
                if(loc[1]<col){
                    colMax=col; colMin=loc[1];
                }
                
                boolean b=true;
                for(int i=rowMin;i<=rowMax;i++){
                    if(arr[i][loc[1]]==1) {
                        b=false;
                        break;
                    }
                }
                for(int i=colMin;i<=colMax;i++){
                    if(arr[loc[0]][i]==1) {
                        b=false;
                        break;
                    }
                }
                if(b){
                    loc[0]=row;
                    loc[1]=col;
                }
            }
        }
        
        int[] answer = {loc[0],loc[1]};
        return answer;
    }
}