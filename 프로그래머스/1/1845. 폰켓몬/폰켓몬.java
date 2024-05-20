import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int len=nums.length;
        int get=len/2;
        
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums) set.add(num);
        if(set.size()>=get) answer=get;
        else answer=set.size();
        
        return answer;
    }
}