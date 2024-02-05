package programmers.Lv0.n번째원소부터;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        int[] num_list = {2, 1, 6};
        int n = 3;

        List<Integer> list = new ArrayList<>();
        for (int i=n-1; i<num_list.length; i++) {
            list.add(num_list[i]);
        }

        int[] answer = list.stream().mapToInt(i->i).toArray();
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
