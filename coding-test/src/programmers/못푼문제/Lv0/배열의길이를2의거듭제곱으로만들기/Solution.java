package programmers.못푼문제.Lv0.배열의길이를2의거듭제곱으로만들기;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int n = arr.length;
        int targetLength = 1;

        while (targetLength < n) {
            targetLength *= 2;
        }

        int[] answer = new int[targetLength];
        Arrays.fill(answer, 0);

        System.out.println(Arrays.toString(answer));

        System.arraycopy(arr, 0, answer, 0, n);
        System.out.println(Arrays.toString(answer));

    }
}
