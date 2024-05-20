import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        
        int[] stay=new int[N];
       int pass=0;
        for(int s:stages){
            if(s<=N) stay[s-1]++;
            else pass++; //모두 통과한 사람
        }
        
          for (int s: stay) {
 
}
       
         double[][] fail=new double[N][2];
        
        for(int i=N-1;i>=0;i--){
            System.out.println("pass "+pass);
            pass+=stay[i];
            fail[i][0]=i+1;
            if(pass==0) fail[i][1]=0;
            else fail[i][1]=(double)stay[i]/(double)pass;
           
            
          
        }
        
       Arrays.sort(fail, (o1, o2) -> Double.compare(o2[1], o1[1]));

        
         int[] answer = new int[N];
        for(int i=0;i<N;i++){
            answer[i]=(int)fail[i][0];
        }
        return answer;
    }
}