import java.util.*;
class Solution {
    public int solution(int n, int[][] wires) {
        int answer = 100;
        
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++) list.add(new ArrayList<>());
        
        //초기 세팅
        for(int[] w : wires){
            int n1 = w[0]-1;
            int n2 = w[1]-1;
            list.get(n1).add(n2);
            list.get(n2).add(n1);
        }
        
//         for(List<Integer> l : list){
//             for(Integer ll : l) System.out.print(ll+"/");
//             System.out.println();
//         }
        
        //탐색
        for(int i=0;i<n-1;i++){
            
            int n1 = wires[i][0]-1;
            int n2 = wires[i][1]-1;
            int cnt=0;
            // System.out.println();
            // System.out.println("**********"+(n1+1)+" "+(n2+1));
            
            boolean[] visited = new boolean[n];
            Queue<Integer> que = new LinkedList<>();
            
            que.add(n1);
            visited[n1]= true;
            cnt++;
            while(!que.isEmpty()){
                int out = que.poll(); //꺼낸 숫자 0~
                if (!visited[out]) {
                    cnt++;
                    // System.out.print((out+1)+"/");
                } //방문 안했으면 카운트
                visited[out] = true; //방문 체크
                
                for(int k=0;k<list.get(out).size();k++){
                    int num = list.get(out).get(k);
                    if(num==n2) continue;
                    if(!visited[num]) que.add(num);
                }
                
            }
            int diff = (n-cnt) - cnt;
            if(diff == 0) return 0;
            diff = diff<0 ? -diff:diff;
            
            if(answer>diff) answer=diff;
            
        }
        
        return answer;
    }
}