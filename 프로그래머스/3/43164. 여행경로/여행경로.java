import java.util.*;

class Solution {
    private boolean[] visited;
    private String[] path;
    private String[][] tickets;
    private boolean finished;
    private int idx;
    
    public String[] solution(String[][] tickets) {
        this.tickets = tickets;
        this.visited = new boolean[tickets.length];
        this.path = new String[tickets.length+1];
        this.finished = false;
        this.idx=0;
        
        // 모든 티켓을 알파벳 순으로 정렬
        Arrays.sort(tickets, new Comparator<String[]>() {
            @Override
            public int compare(String[] a, String[] b) {
                return a[1].compareTo(b[1]);
            }
        });

        // DFS 시작
        dfs("ICN", 0);
        
        return path;
    }

    private void dfs(String current, int count) {
        path[idx++]=current;

        // 모든 티켓을 사용했으면 종료
        if (count == tickets.length) {
            finished = true;
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!visited[i] && tickets[i][0].equals(current)) {
                visited[i] = true;
                dfs(tickets[i][1], count + 1);

                if (finished) return;

                // 백트래킹
                visited[i] = false;
                idx--;
            }
        }
    }
}
