import java.util.*;

class Solution {
    public int[] solution(String msg) {
        HashMap<String, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int idx = 1;
        for (int i = 0; i < 26; i++) {
            String str = (char)('A' + i) + "";
            map.put(str, idx++);
        }

        int s = 0;
        while (s < msg.length()) {
            int e = s + 1;
            while (e <= msg.length() && map.containsKey(msg.substring(s, e))) {
                e++;
            }
           
            ans.add(map.get(msg.substring(s, e - 1))); 
            
            if (e <= msg.length()) {
                map.put(msg.substring(s, e), idx++);
            }
           
            s = e - 1;
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
