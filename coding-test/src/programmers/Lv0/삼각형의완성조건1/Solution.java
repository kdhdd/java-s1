package programmers.Lv0.삼각형의완성조건1;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int[] sides = {1, 2, 3};
        int answer = 0;

        Arrays.sort(sides);
        if (sides[2] < (sides[0]) + sides[1])
            answer = 1;
        else
            answer = 2;
        System.out.println(answer);
    }
}
