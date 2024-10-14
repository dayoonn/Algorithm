import java.util.*;

class Solution {
    static int[] answer = new int[2];  // 0의 개수와 1의 개수를 저장

    public int[] solution(int[][] arr) {
        int n = arr.length;
        answer[0] = 0;  // 0의 개수
        answer[1] = 0;  // 1의 개수
        
        
        check(arr, 0, 0, n);
        return answer;
    }

    // 주어진 영역이 모두 동일한 값을 갖는지 확인하고, 그렇다면 압축
    public void check(int[][] arr, int x, int y, int size) {
        if (isSame(arr, x, y, size)) {
            // 모든 값이 동일하면 해당 값을 카운트에 반영
            answer[arr[x][y]]++;
        } else {
            // 영역을 4분할해서 각각 압축 시도
            int newSize = size / 2;
            check(arr, x, y, newSize);  // 좌상
            check(arr, x, y + newSize, newSize);  // 우상
            check(arr, x + newSize, y, newSize);  // 좌하
            check(arr, x + newSize, y + newSize, newSize);  // 우하
        }
    }

    // 주어진 영역이 모두 같은 값을 갖고 있는지 확인하는 함수
    public boolean isSame(int[][] arr, int x, int y, int size) {
        int value = arr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != value) {
                    return false;
                }
            }
        }
        return true;
    }
}
