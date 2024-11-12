import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long solution(int[] weights) {
        Map<Integer, Long> weightCount = new HashMap<>();
        long pairCount = 0;

        // 각 몸무게의 빈도수를 카운트
        for (int weight : weights) {
            weightCount.put(weight, weightCount.getOrDefault(weight, 0L) + 1);
        }

        // 각 몸무게마다 짝을 계산
        for (int w : weightCount.keySet()) {
            long countW = weightCount.get(w);

            // 1. 동일한 몸무게끼리 짝을 이룰 경우 조합 계산
            pairCount += countW * (countW - 1) / 2;

            // 2. 거리 비율에 따른 가능한 다른 짝 조합들 계산
            int[] multipliers = {2, 3, 4};
            for (int multiplier : multipliers) {
                int[] distances = {2, 3, 4};
                for (int distance : distances) {
                    // 비율 적용하여 타겟 몸무게 계산
                    int targetWeight = w * multiplier / distance;

                    // 정수 여부 확인, 타겟 몸무게가 존재하는지 확인, 중복 방지
                    if (w * multiplier % distance == 0 && weightCount.containsKey(targetWeight) && targetWeight > w) {
                        pairCount += countW * weightCount.get(targetWeight);
                    }
                }
            }
        }

        return pairCount;
    }

}
