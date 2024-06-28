import java.util.*;

class Solution {
    static boolean[] visited;
    static int[] arrIdx;
    static int n; //던전 개수
    static int[] result;
    static int max;

    public int solution(int k, int[][] dungeons) {
        n=dungeons.length;
        visited=new boolean[n];
        arrIdx=new int[n];
        result=new int[n];
        max=0;
        for(int i=0;i<n;i++) arrIdx[i]=i; //[0~n];
        
        recur(0,dungeons,k);
        
        int answer = max;
        return answer;
    }
    
    public void recur(int depth,int[][] dun,int k){
        for(int i=0;i<n;i++){
            if(depth==n) {
                cal(dun,k);
            }
            if(!visited[i]){
                result[depth]=arrIdx[i];
                visited[i]=true;
                recur(depth+1,dun,k);
                visited[i]=false;
            }
        }
    }
    
    public void cal(int[][] dun,int k){
        int cnt=0;
        int now=k;
        for(int idx:result){
            if(now<dun[idx][0]) break;
            else{
                cnt++;
                now-=dun[idx][1];
            }
        }
        
        if(max<cnt) max=cnt;
    }
}