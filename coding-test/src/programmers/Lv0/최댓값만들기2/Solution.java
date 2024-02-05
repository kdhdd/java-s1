package programmers.Lv0.최댓값만들기2;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int[] numbers = {1, 2, -3, 4, -5};

        Arrays.sort(numbers);

        int answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        if (numbers[0] * numbers[1] > numbers[numbers.length-1] * numbers[numbers.length-2])
            answer = numbers[0] * numbers[1];

        System.out.println(answer);
    }
}
