import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("code",0);
        map.put("date",1);
        map.put("maximum",2);
        map.put("remain",3);
        
        int ext_index=map.get(ext);
        int sort_index=map.get(sort_by);
        
        Arrays.sort(data,(o1,o2)->{
             return o1[sort_index]-o2[sort_index];
        });
        
        
        int[][] answer = Arrays.stream(data).filter(arr->arr[ext_index]<val_ext).toArray(int[][]::new);
        return answer;
    }
}