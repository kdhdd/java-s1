package programmers.Lv0.마지막두원소;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {

        int[] num_list = {5, 2, 1, 7, 5};

        List<Integer> list = new ArrayList<>();
        for (int i : num_list) {
            list.add(i);
        }

        if (list.get(num_list.length - 1) > list.get(num_list.length - 2)) {
            list.add(list.get(num_list.length - 1) - list.get(num_list.length - 2));
        } else {
            list.add(list.get(num_list.length - 1) * 2);
        }

        System.out.println(list);
    }
}
