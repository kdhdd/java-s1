package programmers.못푼문제.Lv0.피자나눠먹기1;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 7 == 0) {
            answer = n / 7;
        } else {
            answer = n / 7 + 1;
        }
        return answer;
    }
}

class SolutionMain {
    public static void main(String[] args) {
        Solution s = new Solution();

        int n = 15;

        System.out.println(s.solution(n));
    }
}
