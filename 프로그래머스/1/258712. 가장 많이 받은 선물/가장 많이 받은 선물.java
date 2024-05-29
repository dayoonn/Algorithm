import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        HashMap<String,Integer> n=new HashMap<>(); //이름의 위치
        HashMap<Integer,String> name=new HashMap<>(); //위치의 이름
        int idx=0;
        for(String s:friends) {
            n.put(s,idx);
            name.put(idx++,s);
        }
        
        int[][] chart=new int[friends.length][friends.length]; //주고받은 횟수 (본인 위치는 선물지수)
        
        for(String g:gifts){
            String from=g.split(" ")[0];
            String to=g.split(" ")[1];
            
            chart[n.get(from)][n.get(from)]++; //준사람 선물지수 +
            chart[n.get(to)][n.get(to)]--; //받은사람 선물지수 -
            
            chart[n.get(from)][n.get(to)]++; //[준사람][받은사람]++
        }
        
        
        int[] next=new int[friends.length]; //다음달 받는 선물
       
        for(int i=0;i<friends.length;i++){
            String A=name.get(i);
            for(int j=i+1;j<friends.length;j++){
                String B=name.get(j);
                
                if(chart[n.get(A)][n.get(B)]==chart[n.get(B)][n.get(A)]){ //주고받은 수가 같다면
                    int indexA=chart[n.get(A)][n.get(A)];
                    int indexB=chart[n.get(B)][n.get(B)];
                    if(indexA>indexB) next[n.get(A)]++;
                    else if(indexB>indexA) next[n.get(B)]++;
                    
                }else{ //주고 받은 수가 다르다면
                    if(chart[n.get(A)][n.get(B)]>chart[n.get(B)][n.get(A)]){
                        next[n.get(A)]++;
                    }
                    else {
                        next[n.get(B)]++;
                    }
                }
                
            }
        }
        int max=0;
        for(int i:next){
            if(i>max)max=i;
        }
        
  
        return max;
    }
}