import java.util.*;

class Solution {
    static int[] dr = {0, 1, 1}; // 우, 하, 대각선 우하
    static int[] dc = {1, 0, 1};
    
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] map = new char[m][n];
        
        // 맵 초기화
        for (int i = 0; i < m; i++) {
            map[i] = board[i].toCharArray();
        }
        
        boolean hasBlockToRemove = true;
        
        while (hasBlockToRemove) {
            boolean[][] marked = new boolean[m][n];
            hasBlockToRemove = false;
            
            // 2x2 블록 탐색
            for (int row = 0; row < m - 1; row++) {
                for (int col = 0; col < n - 1; col++) {
                    char current = map[row][col];
                    if (current != ' ' && checkBlock(map, row, col, current)) {
                        markBlocks(marked, row, col);
                        hasBlockToRemove = true;
                    }
                }
            }
            
            // 블록을 지우고 카운팅
            answer += removeBlocks(map, marked);
            
            // 블록 떨어뜨리기
            dropBlocks(map);
        }
        
        return answer;
    }
    
    // 2x2 블록을 확인하는 함수
    private boolean checkBlock(char[][] map, int row, int col, char current) {
        for (int i = 0; i < 3; i++) {
            int nr = row + dr[i];
            int nc = col + dc[i];
            if (map[nr][nc] != current) {
                return false;
            }
        }
        return true;
    }
    
    // 2x2 블록을 삭제할 목록에 추가
    private void markBlocks(boolean[][] marked, int row, int col) {
        marked[row][col] = true;
        for (int i = 0; i < 3; i++) {
            marked[row + dr[i]][col + dc[i]] = true;
        }
    }
    
    // 블록을 지우고 지워진 블록 수 반환
    private int removeBlocks(char[][] map, boolean[][] marked) {
        int count = 0;
        for (int i = 0; i < marked.length; i++) {
            for (int j = 0; j < marked[0].length; j++) {
                if (marked[i][j]) {
                    map[i][j] = ' ';
                    count++;
                }
            }
        }
        return count;
    }
    
    // 블록을 떨어뜨리는 함수
    private void dropBlocks(char[][] map) {
        for (int col = 0; col < map[0].length; col++) {
            for (int row = map.length - 1; row >= 0; row--) {
                if (map[row][col] == ' ') {
                    // 빈 공간을 위로 채운다
                    int r = row - 1;
                    while (r >= 0 && map[r][col] == ' ') {
                        r--;
                    }
                    if (r >= 0) {
                        map[row][col] = map[r][col];
                        map[r][col] = ' ';
                    }
                }
            }
        }
    }
}
