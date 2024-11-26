import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = 100;
        
        // 인접 리스트 생성
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        
        // 초기 세팅
        for (int[] w : wires) {
            int n1 = w[0] - 1;
            int n2 = w[1] - 1;
            list.get(n1).add(n2);
            list.get(n2).add(n1);
        }
        
        // 탐색
        for (int i = 0; i < n - 1; i++) {
            int n1 = wires[i][0] - 1;
            int n2 = wires[i][1] - 1;
            
            // 연결을 끊고 탐색
            boolean[] visited = new boolean[n];
            int cnt = bfs(list, visited, n1, n2); // n1에서 출발, n2는 연결 끊음
            
            // 두 네트워크의 차이 계산
            int diff = Math.abs((n - cnt) - cnt);
            answer = Math.min(answer, diff);
        }
        
        return answer;
    }
    
    private int bfs(List<List<Integer>> list, boolean[] visited, int start, int skip) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        int count = 1;
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            
            for (int neighbor : list.get(node)) {
                if (neighbor == skip || visited[neighbor]) continue; // 연결 끊긴 노드 무시
                visited[neighbor] = true;
                queue.add(neighbor);
                count++;
            }
        }
        
        return count;
    }
}
