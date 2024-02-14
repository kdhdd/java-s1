package programmers.Lv0.A로B만들기;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        String before = "allpe";
        String after = "apple";

        String[] beforeArr = before.split("");
        Arrays.sort(beforeArr);

        String[] afterArr = after.split("");
        Arrays.sort(afterArr);

        int answer = 1;
        for (int i = 0; i < beforeArr.length; i++) {
            if (!beforeArr[i].equals(afterArr[i]))
                answer = 0;
        }

        System.out.println(answer);
    }
}
