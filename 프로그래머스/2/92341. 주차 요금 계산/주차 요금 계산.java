import java.util.*;

class Solution {
    public List<Integer> solution(int[] fees, String[] records) {
        List<Integer> result = new ArrayList<>();
        Queue<String> que=new LinkedList<>();
        Arrays.sort(records,(str1,str2)->Integer.parseInt(str1.substring(6,10))-Integer.parseInt(str2.substring(6,10)));
        
        String before=" ";
        int n=0;
        int[] time=new int[2];
        int[] beforeTime=new int[2];
        int use=0;
        int usefee=0;
        
        for(String s:records){
            
            String[] splt=s.split(" ");
            time[0]=Integer.parseInt(splt[0].split(":")[0]);
            time[1]=Integer.parseInt(splt[0].split(":")[1]);
           
            
            if(s.equals(records[0])){ //첫번째 차
                before=splt[1];
                n++;
            }
            else{
            
            if(!before.equals(splt[1])){ //앞 차랑 다름
                
                if(n%2!=0){ //출차안함 시간 계산
                    use+=59-beforeTime[1];
                    use+=(23-beforeTime[0])*60;
                }
                
                //요금 계산
                if(fees[0]>use){
                    usefee += fees[1];
                }
                else{
                    usefee+= fees[1] + ((use-fees[0])/fees[2])*fees[3];
                    if((double)(use-fees[0])/fees[2]!=(use-fees[0])/fees[2])usefee+=fees[3];
                }
                
                result.add(usefee);
                
                //초기화
                n=1;
                usefee=0;
                use=0;
                before=splt[1];
            }else{ //앞차랑 같음
                if(n%2==0){ //입차
                    before=splt[1];
                    n++;
            
                }else{ //출차
                    if(time[1]-beforeTime[1]<0){
                        use+=60+time[1]-beforeTime[1];
                        System.out.println(60+time[1]-beforeTime[1]);
                        System.out.println((time[0]-1-beforeTime[0])*60);
                        use+=(time[0]-1-beforeTime[0])*60;
                    }else{
                        use+=time[1]-beforeTime[1];
        
                        use+=(time[0]-beforeTime[0])*60;
                    }
                    n++;
                    before=splt[1];
                    
                    
                    
                }
            }
            }
            
        
           beforeTime[0]=time[0];
            beforeTime[1]=time[1];
           
            
        }
         if(n%2!=0){ //출차안함 시간 계산
                    use+=59-beforeTime[1];
                    use+=(23-beforeTime[0])*60;
                }
                
                //요금 계산
                if(fees[0]>use){
                    usefee += fees[1];
                }
                else{
                    usefee+= fees[1] + ((use-fees[0])/fees[2])*fees[3];
                    if((double)(use-fees[0])/fees[2]!=(use-fees[0])/fees[2])usefee+=fees[3];
                }
                
                result.add(usefee);
        
       
        
        
        return result;
    }
}
