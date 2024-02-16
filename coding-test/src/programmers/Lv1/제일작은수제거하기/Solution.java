package programmers.Lv1.제일작은수제거하기;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int[] arr = {10};

        if (arr.length <= 1) {
            int[] answer = new int[1];
            answer[0] = -1;

            System.out.println(Arrays.toString(answer));
        } else {

            int minNum = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (minNum > arr[i])
                    minNum = arr[i];
            }

            int[] answer = new int[arr.length - 1];
            int idx = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == minNum)
                    continue;
                else
                    answer[idx++] = arr[i];
            }

            System.out.println(Arrays.toString(answer));
        }
    }
}
