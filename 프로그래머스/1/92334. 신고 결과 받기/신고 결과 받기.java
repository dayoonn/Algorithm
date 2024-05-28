import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        int idx=0;
        for(String s:id_list){
            map.put(s,idx++);
        }
        boolean[][] arr=new boolean[id_list.length][id_list.length]; //신고여부
        int[] num= new int[id_list.length];
        int[] mail= new int[id_list.length];
        for(String s:report){
            String from=s.split(" ")[0];
            String to=s.split(" ")[1];
            
            if(!arr[map.get(from)][map.get(to)]){//신고한적없으면
                arr[map.get(from)][map.get(to)]=true;
                num[map.get(to)]++;//신고당한 횟수 증가
                }
 
        }
        
        for(int i=0;i<id_list.length;i++){
            if(num[i]>=k){
                for(int row=0;row<id_list.length;row++){
                    if(arr[row][i]) mail[row]++;
                }
            }
        }

        return mail;
    }
}