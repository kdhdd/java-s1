package programmers.못푼문제.Lv0.가까운수;

public class Solution {
    public static void main(String[] args) {

        int[] array = {3, 10, 28};
        int n = 20;
        int answer = 0;

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int diff = Math.abs(n - array[i]);
            if (diff < min) {
                min = diff;
                answer = array[i];
            } else if (diff == min && array[i] < answer) {
                answer = array[i];
            }
        }

        System.out.println(answer);

    }
}
