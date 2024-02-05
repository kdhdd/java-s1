package programmers.Lv0.최댓값만들기1;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int[] numbers = {0, 31, 24, 10, 1, 9};
        Arrays.sort(numbers);

        int answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        System.out.println(answer);
    }
}
