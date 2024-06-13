import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int [] arr=new int[(int)(right-left)+1];
        
        long start_row=left/(long)n;
        long start_col=left%(long)n;
        long end_row=right/(long)n;
        long end_col=right%(long)n;
        
      //  System.out.println(start_row +"/"+start_col+"/"+end_row+"/"+end_col);
        int idx=0;
      
        for(long r=start_row;r<=end_row;r++){
            for(long c=0;c<n;c++){
                if(r==start_row&&c<start_col) c=start_col;
                if(r==end_row&&c>end_col)break;
                
                if(c<=r) arr[idx++]=(int)r+1;
                else arr[idx++]=(int)c+1;
            }
        }
        
    
        return arr;
    }
}