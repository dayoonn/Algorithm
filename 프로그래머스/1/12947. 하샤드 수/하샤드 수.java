class Solution {
    public boolean solution(int x) {
        int sum=0;
        String s=Integer.toString(x);
        
        for(int i=0;i<s.length();i++){
            sum+=s.charAt(i)-'0';
        }
       
        if(x%sum==0) return true;
        else return false;
    }
}