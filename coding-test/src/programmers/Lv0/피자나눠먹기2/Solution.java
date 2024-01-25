package programmers.Lv0.피자나눠먹기2;

public class Solution {
    public int solution(int n) {
        int max = 0;
        for (int i = 1; i <= n && i <= 6; i++) {
            if (n % i == 0 && 6 % i == 0) {
                max = i;
            }
        }

        int min = (n*6) / max;

        return min / 6;
    }
}

class SolutionMain {
    public static void main(String[] args) {
        Solution s = new Solution();

        int n = 10;

        System.out.println(s.solution(n));
    }
}
