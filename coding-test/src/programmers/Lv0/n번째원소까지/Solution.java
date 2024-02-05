package programmers.Lv0.n번째원소까지;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;

        List<Integer> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            list.add(num_list[i]);
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();
        for (int i : answer) {
            System.out.println(i);
        }

    }
}
