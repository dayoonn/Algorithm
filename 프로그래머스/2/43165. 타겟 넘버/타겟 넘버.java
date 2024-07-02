class Solution {
    static int result = 0;
    public int solution(int[] numbers, int target) {
        dfs(0, numbers, target, 0);
        return result;
    }

    private static void dfs(int depth, int[] num, int target, int sum) {
        if(depth == num.length) {
            if(target == sum) {
                result++;
            }
            return;
        }
        dfs(depth + 1, num, target, sum + num[depth]);
        dfs(depth + 1, num, target, sum - num[depth]);
    }
}