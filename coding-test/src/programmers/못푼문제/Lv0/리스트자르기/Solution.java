package programmers.못푼문제.Lv0.리스트자르기;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int n = 4;
        int[] slicer = {1, 5, 3};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int a = slicer[0], b = slicer[1], c = slicer[2];

        int[] answer;
        if (n == 1) {
            answer = new int[b + 1];
            for (int i = 0; i <= b; i++) {
                answer[i] = num_list[i];
            }
            System.out.println(Arrays.toString(answer));
        } else if (n == 2) {
            answer = new int[num_list.length - a];
            int idx = 0;
            for (int i = a; i < num_list.length; i++) {
                answer[idx++] = num_list[i];
            }
            System.out.println(Arrays.toString(answer));
        } else if (n == 3) {
            answer = new int[b - a + 1];
            int idx = 0;
            for (int i = a; i <= b; i++) {
                answer[idx++] = num_list[i];
            }
            System.out.println(Arrays.toString(answer));
        } else if (n == 4) {
            int count = (b - a + 1) / c;
            if ((b - a + 1) % c != 0)
                count++;
            answer = new int[count];
            int idx = 0;
            for (int i = a; i <= b; i+=c) {
                answer[idx++] = num_list[i];
            }
            System.out.println(Arrays.toString(answer));
        } else {
            answer = new int[0];
        }

    }
}
