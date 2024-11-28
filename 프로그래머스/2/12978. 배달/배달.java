import java.util.*;

class Solution {
    static int[][] map;
    static int n;

    public int solution(int N, int[][] road, int K) {
        n = N;
        map = new int[N + 1][N + 1];
        
        // 그래프 초기화
        for (int[] ro : road) {
            if (map[ro[0]][ro[1]] == 0) {
                map[ro[0]][ro[1]] = ro[2];
                map[ro[1]][ro[0]] = ro[2];
            } else {
                int small = Math.min(map[ro[0]][ro[1]], ro[2]);
                map[ro[0]][ro[1]] = small;
                map[ro[1]][ro[0]] = small;
            }
        }

        // 각 노드까지의 최단 거리 저장 배열
        int[] distances = new int[N + 1];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[1] = 0;

        // BFS를 위한 우선순위 큐 (거리 기준 오름차순)
        Queue<int[]> pq = new LinkedList<>();
        pq.add(new int[]{1, 0}); // 시작 노드

        while (!pq.isEmpty()) {
            int[] now = pq.poll();
            int current = now[0];
            int currentDist = now[1];

            // 이미 더 짧은 거리로 방문된 경우 무시
            if (currentDist > distances[current]) continue;

            // 인접 노드 탐색
            for (int i = 1; i <= n; i++) {
                if (map[current][i] != 0) {
                    int newDist = currentDist + map[current][i];
                    if (newDist < distances[i] && newDist <= K) {
                        distances[i] = newDist;
                        pq.add(new int[]{i, newDist});
                    }
                }
            }
        }

        // 거리 조건을 만족하는 노드 개수 계산
        int answer = 0;
        for (int dist : distances) {
            if (dist <= K) answer++;
        }

        return answer;
    }
}
