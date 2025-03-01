import java.util.*;

class Solution {
    // 최대공약수 구하는 메서드
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    // 배열의 최대공약수를 구하는 메서드
    private int getGCD(int[] array) {
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = gcd(result, array[i]);
            if (result == 1) return 1; // GCD가 1이면 더 이상 진행할 필요 없음
        }
        return result;
    }

    // GCD가 다른 배열의 원소를 하나라도 나누는지 확인하는 메서드
    private boolean isDivisible(int gcd, int[] array) {
        for (int num : array) {
            if (num % gcd == 0) return true; // 나누어지면 조건 불만족
        }
        return false;
    }

    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = getGCD(arrayA);
        int gcdB = getGCD(arrayB);

        int resultA = isDivisible(gcdA, arrayB) ? 0 : gcdA;
        int resultB = isDivisible(gcdB, arrayA) ? 0 : gcdB;

        return Math.max(resultA, resultB);
    }
}