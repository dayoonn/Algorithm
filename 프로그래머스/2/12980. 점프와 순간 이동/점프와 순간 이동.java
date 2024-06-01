import java.util.*;

public class Solution {
    public int solution(int n) {
        String s=Integer.toBinaryString(n);
        s=s.replace("0","");
        int ans = s.length();

        return ans;
    }
}