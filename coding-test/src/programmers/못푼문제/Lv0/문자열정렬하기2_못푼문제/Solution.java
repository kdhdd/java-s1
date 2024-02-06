package programmers.못푼문제.Lv0.문자열정렬하기2_못푼문제;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        String my_string = "Bcad";

        String answer = my_string.toLowerCase();
        char[] ch = answer.toCharArray();
        Arrays.sort(ch);
        answer = new String(ch);
        System.out.println(answer);
    }
}
