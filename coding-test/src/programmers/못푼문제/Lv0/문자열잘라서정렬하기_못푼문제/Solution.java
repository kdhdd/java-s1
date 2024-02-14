package programmers.못푼문제.Lv0.문자열잘라서정렬하기_못푼문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        String myString = "dxccxbbbxaaaax";

        String[] result = myString.split("x");
        List<String> list = new ArrayList<>();
        for (String s : result) {
            if (!s.isEmpty())
                list.add(s);
        }
        String[] answer = list.toArray(new String[list.size()]);
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
    }
}
