import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        if (x == y) return 0;  // 시작점이 목표와 동일한 경우

        Queue<Integer> q = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>(); // num -> 연산 횟수

        q.add(x);
        map.put(x, 0);

        while (!q.isEmpty()) {
            int num = q.poll();
            int cnt = map.get(num);

            // 가능한 세 가지 연산
            int[] nextNums = {num + n, num * 2, num * 3};

            for (int nextNum : nextNums) {
                if (nextNum == y) {  // 목표 숫자에 도달한 경우
                    return cnt + 1;
                }
                if (nextNum < y && !map.containsKey(nextNum)) {  // 아직 처리되지 않은 경우
                    map.put(nextNum, cnt + 1);
                    q.add(nextNum);
                }
            }
        }

        return -1;  // 목표 숫자에 도달할 수 없는 경우
    }
}
