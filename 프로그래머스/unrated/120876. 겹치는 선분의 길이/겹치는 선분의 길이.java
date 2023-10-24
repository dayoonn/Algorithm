class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] visited=new int[201];
        
        for(int[] l:lines){
            int s=l[0];
            int e=l[1];
            
            for(int i=s;i<e;i++){
                if(visited[i+100]==1) 
                    answer++;
                visited[i+100]++;
            }
        }
        
        return answer;
    }
}