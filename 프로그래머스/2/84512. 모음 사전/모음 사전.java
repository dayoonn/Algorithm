import java.util.*;
class Solution {
    static String[] alp=new String[]{"A","E","I","O","U"};
    public int solution(String word) {
        
        List<String> list=new ArrayList<>();
        
        for(int i=0;i<5;i++){
            dfs(list,alp[i],word);
        }
        
        int answer = list.indexOf(word)+1;
        return answer;
    }
    
    public void dfs(List<String> list,String str,String word){
        if(str.length()>5) return;
        
        if(!list.contains(str)) list.add(str);
        if(word.equals(str)) return;
       
        for(int i=0;i<5;i++){
            dfs(list,str+alp[i],word);
        }
    }
}