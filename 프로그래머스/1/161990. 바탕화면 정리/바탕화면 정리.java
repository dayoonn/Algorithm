class Solution {
    public int[] solution(String[] wallpaper) {
        int col=wallpaper.length;
        int xMax=0,yMax=0;
        int xMin=50,yMin=50;
        for(int y=0;y<col;y++){
            int row=wallpaper[y].length();
            for(int x=0;x<row;x++){
                if(wallpaper[y].charAt(x)=='#'){
                    if(x>xMax) xMax=x;
                    if(x<xMin) xMin=x;
                    if(y>yMax) yMax=y;
                    if(y<yMin) yMin=y;
                }
            }
        }
        
        
        int[] answer = {yMin,xMin,yMax+1,xMax+1};
        return answer;
    }
}