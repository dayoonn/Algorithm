class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int[] q:queries){
            int tmp=arr[q[0]];
            arr[q[0]]=arr[q[1]];
            arr[q[1]]=tmp;
           
        }
        answer=arr;
        return answer;
    }
}