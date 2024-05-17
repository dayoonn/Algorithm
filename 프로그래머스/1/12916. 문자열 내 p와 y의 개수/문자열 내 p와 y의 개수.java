

class Solution {
    boolean solution(String s) {
    int p_num=0;
    int y_num=0;
        
    s=s.toLowerCase();
    System.out.println(s);
   
    for(char ch :s.toCharArray()){
        if(ch=='p') p_num++;
        else if(ch=='y') y_num++;
    }
    
    if(p_num==y_num) return true;
    else return false;
    }
}