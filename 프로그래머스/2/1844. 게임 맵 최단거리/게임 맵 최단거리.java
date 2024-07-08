import java.util.LinkedList;
import java.util.Queue;

class Solution {
    
 
    public int solution(int[][] maps) {
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        
        // 방향 벡터 (우, 하, 상, 좌)
        int[] dy = {0, 1, -1, 0};
        int[] dx = {1, 0, 0, -1};
        
        // BFS 수행
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int y = current[0];
            int x = current[1];
            
            for (int i = 0; i < 4; i++) {
                int movey = y + dy[i]; 
                int movex = x + dx[i];
                
                // 범위 초과 확인
                if (movey < 0 || movey >= maps.length || movex < 0 || movex >= maps[0].length) {
                    continue;
                }
                
                // 벽이 아닌 곳만 탐색
                if (maps[movey][movex] == 1) {
                    maps[movey][movex] = maps[y][x] + 1;
                    queue.add(new int[]{movey, movex});
                }
            }
        }
        
        int answer = maps[maps.length - 1][maps[0].length - 1];
        if (answer == 1) return -1;
        return answer;
    }
}
