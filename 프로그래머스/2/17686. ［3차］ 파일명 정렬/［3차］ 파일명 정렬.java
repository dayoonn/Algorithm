import java.util.*;

class Solution {
    public String[] solution(String[] files) {
       
        String[] answer = new String[files.length];
        List<File> list= new ArrayList<>();
       
        for(int i=0;i<files.length;i++){
            String now=files[i];
            int startN=0; // 숫자 시작 index
            
            // 숫자 시작 인덱스 찾기
            while (startN < now.length() && !Character.isDigit(now.charAt(startN))) {
                startN++;
            }

            int endN = startN;

            // 숫자 끝 인덱스 찾기 (최대 5자리 숫자까지만)
            while (endN < now.length() && Character.isDigit(now.charAt(endN)) && endN - startN < 5) {
                endN++;
            }

            String h = now.substring(0, startN);
            String n = now.substring(startN, endN);  // 숫자는 최대 5자리

            File newFile = new File(now, h, n, i);
            list.add(newFile);
        }
        
        // 대소문자 무시 정렬 후, number 정렬
        list.sort(Comparator.comparing((File f) -> f.head.toLowerCase())
                .thenComparingInt(f -> Integer.parseInt(f.number))
                .thenComparingInt(f -> f.idx));

        int i = 0;
        for (File f : list) {
            answer[i++] = f.orig;
        }
        
        return answer;
    }
    
    public class File {
        String orig;
        String head;
        String number;
        int idx;
            
        public File(String o, String h, String n, int i) {
            orig = o;
            head = h;
            number = n;
            idx = i;
        }
    }
}
