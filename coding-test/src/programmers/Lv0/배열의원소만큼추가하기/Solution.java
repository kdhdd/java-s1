package programmers.Lv0.배열의원소만큼추가하기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        int[] arr = {5, 1, 4};

        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            for (int j=0; j<i; j++) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
