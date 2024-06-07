import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        HashMap<Character,Character> map=new HashMap<>();
        map.put(']','[');
        map.put('}','{');
        map.put(')','(');
       
        Queue<Character> q= new LinkedList<Character>();
        for(char c:s.toCharArray()){
            q.offer(c);
        }
        
        for(int i=0;i<s.length();i++){
            q.offer(q.poll());
            answer+=check(q,map);
            
            
        }
        
        
        return answer;
        
    }
    
    public int check(Queue q,HashMap map){
        Stack<Character> st=new Stack<>();
        List<Character> list = new ArrayList<>(q);
        for(Character c:list){
            if(c=='}'||c==']'||c==')'){
                if(st.isEmpty()) return 0;
                else{
                    if(st.peek()!=map.get(c)) return 0;
                    else st.pop();
                }
            }else{
                    st.push(c);
                }
        }
        if(st.size()>0) return 0;
        return 1;
    }
}