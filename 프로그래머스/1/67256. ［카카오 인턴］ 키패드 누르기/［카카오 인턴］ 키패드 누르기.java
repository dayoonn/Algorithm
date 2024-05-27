import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        HashMap<String,int[]> map=new HashMap<>();
        map.put("1",new int[]{0,0});
        map.put("2",new int[]{0,1});
        map.put("3",new int[]{0,2});
        map.put("4",new int[]{1,0});
        map.put("5",new int[]{1,1});
        map.put("6",new int[]{1,2});
        map.put("7",new int[]{2,0});
        map.put("8",new int[]{2,1});
        map.put("9",new int[]{2,2});
        map.put("*",new int[]{3,0});
        map.put("0",new int[]{3,1});
        map.put("#",new int[]{3,2});
        
        int[] nowl={3,0};
        int[] nowr={3,2};
        for(int num:numbers){
            int movel=0; int mover=0; //움직이는 횟수
            String strN=Integer.toString(num);
            if(num==1||num==4||num==7){ //왼손
                answer+="L";
                nowl=map.get(strN);
                
            }else if(num==3||num==6||num==9){ //오른손
                answer+="R";
                nowr=map.get(strN);
                
            }else{ 
                movel=Math.abs(nowl[0]-map.get(strN)[0])+Math.abs(nowl[1]-map.get(strN)[1]);
                mover=Math.abs(nowr[0]-map.get(strN)[0])+Math.abs(nowr[1]-map.get(strN)[1]);
                if(movel<mover){
                    answer+="L";
                    nowl=map.get(strN);
                    
                }else if(movel>mover){
                    answer+="R";
                    nowr=map.get(strN);
                    
                }else{
                    if(hand.equals("right")){
                        answer+="R";
                        nowr=map.get(strN);
                        
                    }else{
                        answer+="L";
                        nowl=map.get(strN);
                        
                    }
                }
            }
        }
        
        
        return answer;
    }
    
}