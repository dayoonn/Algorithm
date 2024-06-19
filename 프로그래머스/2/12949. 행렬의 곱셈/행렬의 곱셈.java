class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] ans=new int[arr1.length][arr2[0].length];
        
        for(int i=0;i<arr1.length;i++){ //a row
            for(int j=0;j<arr2[0].length;j++){ //b col
                for(int z=0;z<arr1[0].length;z++){ // a col
                    ans[i][j]+=arr1[i][z]*arr2[z][j];
                }
            }
            
        }
        
        
        
        return ans;
    }
}