package programmers.Lv0.n의배수고르기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n = 3;

        List<Integer> list = new ArrayList<>();
        for (int i : numlist) {
            if (i % n == 0)
                list.add(i);
        }

        int[] result = list.stream().mapToInt(i->i).toArray();
        for (int i : result) {
            System.out.println(i);
        }
    }
}
