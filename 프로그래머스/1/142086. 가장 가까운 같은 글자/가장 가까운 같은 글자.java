class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(i==0){
                answer[i]=-1;
            }
            else{
                char c=s.charAt(i);
                StringBuilder sb=new StringBuilder(s.substring(0,i)).reverse();
           
                int index=sb.toString().indexOf(String.valueOf(c));
          
                if(index>-1) answer[i]=index+1;
                else answer[i]=index;
        }
        }
        
        return answer;
    }
}