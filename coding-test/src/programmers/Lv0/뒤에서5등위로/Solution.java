package programmers.Lv0.뒤에서5등위로;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        Arrays.sort(num_list);
        int[] answer = new int[num_list.length-5];
        for (int i=5; i< num_list.length; i++) {
            answer[i-5] = num_list[i];
        }
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
