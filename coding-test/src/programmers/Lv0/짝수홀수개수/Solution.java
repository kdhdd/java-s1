package programmers.Lv0.짝수홀수개수;

public class Solution {
    public int[] solution(int[] num_list) {
        int count_even = 0;
        int count_odd = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                count_even++;
            } else {
                count_odd++;
            }
        }

        int[] answer = {count_even, count_odd};
        return answer;
    }
}
