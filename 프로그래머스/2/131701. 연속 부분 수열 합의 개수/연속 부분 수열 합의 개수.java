import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int len = elements.length;
        List<Integer> list= new ArrayList<>();
        for(int i:elements){
            list.add(i);
        }
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<len;i++){
            int sum=0;
            for(int j=0;j<len;j++){
                sum+=list.get(j);
                set.add(sum);
            }
            int n=list.remove(0);
            list.add(n);
        }
       
        return set.size();
    }
}