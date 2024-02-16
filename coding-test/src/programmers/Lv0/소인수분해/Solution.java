package programmers.Lv0.소인수분해;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        int n = 12;

        List<Integer> list = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            int count = 0;
            if (n % i == 0) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0)
                        count++;
                }
            }

            if (count == 2)
                list.add(i);
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(answer));
    }
}
