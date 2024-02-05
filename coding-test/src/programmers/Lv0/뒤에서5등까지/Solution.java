package programmers.Lv0.뒤에서5등까지;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};
        Arrays.sort(num_list);
        int[] answer = new int[5];

        for (int i=0; i< answer.length; i++) {
            answer[i] = num_list[i];
        }
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
