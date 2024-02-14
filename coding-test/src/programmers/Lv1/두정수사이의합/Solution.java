package programmers.Lv1.두정수사이의합;

import java.util.stream.LongStream;

public class Solution {
    public static void main(String[] args) {

        int a = 3, b = 3;

        if (a > b) {
            int plum = a;
            a = b;
            b = plum;
        }

        long answer = LongStream.rangeClosed(a, b).sum();

        System.out.println(answer);

    }
}
