package programmers.못푼문제.Lv0.문자열묶기;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        String[] strArr = {"a", "bc", "d", "efg", "hi"};

        int[] count = new int[100000];
        for (int i = 0; i < strArr.length; i++) {
            count[strArr[i].length()]++;
        }

        int answer = Arrays.stream(count).max().getAsInt();
        System.out.println(answer);
    }
}
