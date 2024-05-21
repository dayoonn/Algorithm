class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        int[] cntx=new int[10];
        int[] cnty=new int[10];
        String[] x=X.split("");
        String[] y=Y.split("");
        
        for(String n:x) cntx[Integer.parseInt(n)]++;
        for(String n:y) cnty[Integer.parseInt(n)]++;
        
        for(int i=9;i>=0;i--){
            int l=cnty[i];
            int s=cntx[i];
            if(cntx[i]>cnty[i]){
                l=cntx[i];
                s=cnty[i];
            }
            answer+=(i+"").repeat(s);
        }
        
        if(answer.equals("")) answer="-1";
        else if(answer.charAt(0)=='0') answer="0";
        
        
        return answer;
    }
}