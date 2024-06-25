import java.util.*;
import java.util.Collections.*;
class Solution {
    public int[] solution(String s) {
        s=s.replace("{","/");
        s=s.replace("}","/");
        s=s.substring(2,s.length()-2);
        //System.out.println(s);
        
        String[] str=s.split("/./");
        List<List<Integer>> list=new ArrayList<>();
        //for(String st: str) System.out.println(st);
        
        for(int i=0;i<str.length;i++){
            String[] strArr=str[i].split(",");
            List<Integer> row=new ArrayList<>();
            for(String st:strArr){
                row.add(Integer.parseInt(st));
            }
            list.add(row);
        }
        
        Collections.sort(list,(r1,r2)->r1.size()-r2.size());
        
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            list.get(i).removeAll(result);
            int remain=list.get(i).get(0);
            result.add(remain);
        }
  
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}