package programmers.Lv0.배열만들기5;

import java.util.Arrays;

public class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = new int[intStrs.length];
        for (int i = 0; i < intStrs.length; i++) {
            String res = "";
            for (int j = s; j < s+l; j++) {
                res += intStrs[i].charAt(j);
                answer[i] = Integer.parseInt(res);
                }
            }
        return Arrays.stream(answer).filter(i -> i > k).toArray();
    }
}

class SolutionMain {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] intStrs = {"0123456789", "9876543210", "9999999999999"};
        int k = 50000;
        int s = 5;
        int l = 5;

        int[] answer = solution.solution(intStrs, k, s, l);
        for (int string : answer) {
            System.out.println(string);
        }
    }
}
