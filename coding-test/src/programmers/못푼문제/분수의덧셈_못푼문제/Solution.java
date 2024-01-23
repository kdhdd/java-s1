package programmers.못푼문제.분수의덧셈_못푼문제;

public class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1*denom2 + numer2*denom1;
        int denom = denom1*denom2;

        int max = 1;

        for (int i = 1; i<=numer && i<=denom; i++) {
            if (denom%i == 0 && numer%i == 0) {
                max = i;
            }
        }
        numer /= max;
        denom /= max;

        int[] answer = {numer, denom};

        return answer;
    }
}

class SolutionMian {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;

        int[] res = solution.solution(numer1, denom1, numer2, denom2);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
