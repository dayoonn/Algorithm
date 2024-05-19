import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0;i<n;i++){ //지도 생성
            String map1=Integer.toBinaryString(arr1[i]);
            map1=String.format("%"+n+"s",map1).replace(' ','0');
            String map2=Integer.toBinaryString(arr2[i]);
            map2=String.format("%"+n+"s",map2).replace(' ','0');
          
            
            String sumMap="";
            for(int j=0;j<n;j++){
                if(map1.charAt(j)=='0'&&map2.charAt(j)=='0') sumMap+=" ";
                else sumMap+="#";
            }
            answer[i]=sumMap;
        }
        
        
        
        return answer;
    }
}