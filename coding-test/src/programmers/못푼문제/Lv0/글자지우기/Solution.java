package programmers.못푼문제.Lv0.글자지우기;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
        Arrays.sort(indices);
        String answer = "";

        int j = 0;
        for (int i=0; i<my_string.length(); i++) {
            if (j < indices.length && indices[j] == i) {
                j++;
            } else {
                answer += my_string.charAt(i);
            }
        }

        System.out.println(answer);
    }
}
