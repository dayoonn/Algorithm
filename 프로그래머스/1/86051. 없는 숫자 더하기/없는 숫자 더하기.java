import java.util.*;

import java.util.stream.*;
class Solution {
    public int solution(int[] numbers) {
        
        List<Integer> allNum=new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
       List<Integer> listNum = Arrays.stream(numbers).boxed().collect(Collectors.toList()); 
        
       allNum.removeAll(listNum);
       int sum=0;
       for (int num : allNum) {
            sum += num;
        }
       
        return sum;
    }
}