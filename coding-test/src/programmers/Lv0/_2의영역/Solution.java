package programmers.Lv0._2의영역;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 4, 5, 2, 9};
        int min = -1, max = -1;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 2) {
                min = i;
                break;
            }
        }

        for (int i= arr.length-1; i>=0; i--) {
            if (arr[i] == 2) {
                max = i;
                break;
            }
        }

        int[] answer = new int[max-min+1];

        if (min == -1 && max == -1) {
            answer[0] = -1;
        } else {
            int idx = 0;
            for (int i=min; i<=max; i++) {
                answer[idx++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
