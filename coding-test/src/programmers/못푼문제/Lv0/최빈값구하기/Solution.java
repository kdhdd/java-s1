package programmers.못푼문제.Lv0.최빈값구하기;

public class Solution {
    public int solution(int[] array) {
        int max = 0;
        int answer = array[0];
        int[] frequent = new int[1000];

        for (int i = 0; i < array.length; i++) {
            frequent[array[i]]++;

            if (frequent[array[i]] > max) {
                max = frequent[array[i]];
                answer = array[i];
            }
        }

        int temp = 0;
        for (int j = 0; j < 1000; j++) {
            if (max == frequent[j])
                temp++;
            if (temp > 1)
                answer = -1;
        }

        return answer;
    }
}

class SolutionMain {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = {1, 1, 2, 2};
        System.out.println(s.solution(array));
    }
}
