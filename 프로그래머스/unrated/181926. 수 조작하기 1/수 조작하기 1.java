
class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        char[] carr=control.toCharArray();
        for(char c:carr){
            switch(c){
                case 'w':n+=1;break;
                case 's':n-=1;break;
                case 'd':n+=10;break;
                case 'a':n-=10;break;
            }
        }
        answer=n;
        return answer;
    }
}