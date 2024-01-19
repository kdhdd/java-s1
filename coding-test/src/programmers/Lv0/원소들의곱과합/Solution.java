package programmers.Lv0.원소들의곱과합;

public class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        int a = 1, b = 0;

        for (int i : num_list) {
            a *= i;
        }

        for (int i : num_list) {
            b += i;
        }

        if (a < b*b) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }

}
