package programmers.Lv0.삼각형의완성조건2;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int[] sides = {3, 6};
        Arrays.sort(sides);

        int num = 0, cnt = 0;
        while (true) {
            num++;
            if (sides[0] + sides[1] > num && sides[0] + num > sides[1]) {
                cnt++;
            } else if (sides[0] + sides[1] <= num) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
