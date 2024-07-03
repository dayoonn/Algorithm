import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        HashMap<Integer,String> map=new HashMap<>();
        for(int i=0;i<10;i++) map.put(i,Integer.toString(i));
        map.put(10,"A");map.put(11,"B");map.put(12,"C");
        map.put(13,"D");map.put(14,"E");map.put(15,"F");
        List<Integer> list=new ArrayList<>();
        
        list.add(0);
        int last=1;
        for(int i=1;i<t*m;i++){
            int number=i;
            while(number!=0){
                list.add(last,number%n); //remain
                number=number/n; 
            }
            last=list.size();
            if(list.size()>=t*m) break;
        }
        
        String answer = "";
        int idx=0;
        for(int i=0;i<t*m;i++){
            System.out.println(list.get(i));
            if(i%m==p-1) {
                answer+=map.get(list.get(i));
            }
        }
        
        
        return answer;
    }
}