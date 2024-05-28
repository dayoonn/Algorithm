import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int[] arr=new int[attacks[attacks.length-1][0]+1]; //시간당 체력
        int[] att=new int[arr.length];
        for(int[] i:attacks){
            att[i[0]]=i[1];
        }
        arr[0]=health;//초기
        int succ=0; //연속공격
        for(int t=1;t<arr.length;t++){
            if(att[t]==0){
                arr[t]=arr[t-1]+bandage[1]; //공격 없으면 초당 체력추가
                succ++;
                if(succ==bandage[0]){
                    succ=0;
                    arr[t]=arr[t]+bandage[2]; //연속공격 성공시 
                }
            }
            else{ //공격당하면
                arr[t]=arr[t-1]-att[t]; //체력감소
                succ=0; //연속공격 초기화
            }
            if(arr[t]>health) arr[t]=health; //최대체력 초과
            if(arr[t]<=0) return -1;
           
        }
        return arr[arr.length-1];
    }
}