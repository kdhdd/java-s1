package programmers.Lv0.빈배열에추가_삭제하기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            if (flag[i]) {
                for (int j=0; j<arr[i]*2; j++) {
                    list.add(arr[i]);
                }
            } else {
                for (int j=0; j<arr[i]; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }
        int[] answer = new int[list.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        for (int i : answer) {
            System.out.println(i);
        }

    }
}
