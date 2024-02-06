package programmers.Lv0.약수구하기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        int n = 29;
        List<Integer> list = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            if (n % i == 0)
                list.add(i);
        }
        System.out.println(list);
    }
}
