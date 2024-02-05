package programmers.못푼문제.Lv0.분수의덧셈_못푼문제_1;

public class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1*denom2 + numer2*denom1;
        int denom = denom1*denom2;

        int gdc = 1;

        for (int i=1; i<=denom; i++) {
            if (numer % i == 0 && denom % i == 0) {
                gdc = i;
            }
        }

        numer /= gdc;
        denom /= gdc;

        int[] answer = {numer, denom};

        return answer;

    }
}

class SolutionMain {
    public static void main(String[] args) {
        Solution s = new Solution();
        int numer1 = 9;
        int denom1 = 2;
        int numer2 = 1;
        int denom2 = 3;
        int[] result = s.solution(numer1, denom1, numer2, denom2);
        for (int i : result) {
            System.out.println(i);
        }
    }
}


