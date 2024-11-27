import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int answer = 0;
        int[][] intBT = new int[book_time.length][2]; //시간을 분 단위로 저장할 배열
        
        int idx=0;
        for(String[] bt:book_time){
            
            //시작 시간
            String[] time=bt[0].split(":");
            intBT[idx][0]=Integer.parseInt(time[0])*60;
            intBT[idx][0] += Integer.parseInt(time[1]);
            
            //종료 시간
            time = bt[1].split(":");
            intBT[idx][1] = Integer.parseInt(time[0])*60;
            intBT[idx][1] += Integer.parseInt(time[1]) + 10 ; //청소 시간
            
            idx++;
        }
        
        // 시작 시간 빠른 순 정렬
        Arrays.sort(intBT, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]); // 첫 번째 열 기준
            } else {
                return Integer.compare(a[1], b[1]); // 두 번째 열 기준
            }
        });
        
        List<int[]> list = new ArrayList<>();
        for(int ibt[] : intBT){
            int start = ibt[0];
            int end = ibt[1];
            
            boolean b = false;
            for(int i = 0; i< list.size() ; i++){ //현재 스케줄이 있는 방들 루프
                if(list.get(i)[1]<=start){ //이전 방의 종료 시간 <= 지금 방 시작 시간
                    list.get(i)[1]=end; //종료 시간 덮어쓰기
                    b=true;
                    break;
                }
            }
            if(!b){ //들어갈 방이 없다면
                list.add(new int[]{start,end});
            }
        }

        answer = list.size();
        
        
        
        // //test
        // for(int[] ii : intBT){
        //     for(int i : ii){
        //         System.out.print(i+", ");
        //     }
        //     System.out.println();
        // }
        return answer;
    }
}