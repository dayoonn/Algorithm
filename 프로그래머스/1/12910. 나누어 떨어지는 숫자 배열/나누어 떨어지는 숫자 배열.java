import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        Arrays.sort(arr);
        List<Integer> list=new ArrayList<>();
        Arrays.stream(arr).filter(x->x%divisor==0).forEach(list::add);
        if(list.size()==0) list.add(-1);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}