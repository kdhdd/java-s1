package programmers.Lv0.세개의구분자;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        String myStr = "cabab";

        myStr = myStr.replaceAll("[a-c]", " ").trim();

        String[] answer = myStr.split("\\s+");

        for (int i = 0; i < answer.length; i++) {
            if (answer[i].isEmpty())
                answer[i] = "EMPTY";
        }

        System.out.println(Arrays.toString(answer));
    }
}
