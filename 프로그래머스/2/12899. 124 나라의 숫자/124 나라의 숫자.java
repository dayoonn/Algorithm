class Solution {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        
        while (n > 0) {
            n--;  // n을 1 감소시킴으로써 0, 1, 2에 맞는 처리를 할 수 있게 만듦
            int remainder = n % 3;  // 3으로 나눈 나머지를 구함
            if (remainder == 0) {
                answer.append('1');  // 나머지가 0이면 1을 추가
            } else if (remainder == 1) {
                answer.append('2');  // 나머지가 1이면 2를 추가
            } else {
                answer.append('4');  // 나머지가 2이면 4를 추가
            }
            n /= 3;  // n을 3으로 나누어 계속 처리
        }
        
        return answer.reverse().toString();  // 결과는 뒤집어서 반환
    }
}
