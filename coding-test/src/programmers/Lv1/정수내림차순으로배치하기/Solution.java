package programmers.Lv1.정수내림차순으로배치하기;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int n = 118372;
        String str = Long.toString(n);

        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        str = new String(chars);

        StringBuilder sb = new StringBuilder(str);
        str = sb.reverse().toString();
        long answer = Long.parseLong(str);
        System.out.println(answer);
    }
}
