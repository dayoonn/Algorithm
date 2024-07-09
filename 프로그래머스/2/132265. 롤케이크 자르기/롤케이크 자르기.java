import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer,Integer> map1=new HashMap<>();
        HashMap<Integer,Integer> map2=new HashMap<>();
        for(int i=0;i<topping.length;i++){
            map2.put(topping[i],map2.getOrDefault(topping[i],0)+1);
            
        }
        
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=Arrays.stream(topping).boxed().collect(Collectors.toSet());
        
        for(int i=0;i<topping.length-1;i++){
            if(map1.get(topping[i])==null) set1.add(topping[i]);
            if(map2.get(topping[i])==1) set2.remove(topping[i]);
            map1.put(topping[i],map1.getOrDefault(topping[i],0)+1);
            map2.put(topping[i],map2.get(topping[i])-1);
            
            // System.out.println(topping[i]+": "+map1.get(topping[i])+" "+map2.get(topping[i]));
            
           // System.out.println("개수 "+set1.size()+" "+set2.size());
            if(set1.size()==set2.size()) {
                answer++;
                // System.out.println("^^");
            }
            
        }
        
        
        return answer;
    }
}