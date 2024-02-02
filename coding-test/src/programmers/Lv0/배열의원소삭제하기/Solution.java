package programmers.Lv0.배열의원소삭제하기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};

        List<Integer> list = new ArrayList<>();
        for (int i=0; i< arr.length; i++) {
            list.add(arr[i]);
        }


        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    list.remove(Integer.valueOf(arr[i]));
                }
            }
        }

        int[] answer = list.stream().mapToInt(i->i).toArray();
        for (int i : answer) {
            System.out.println(i);
        }

    }
}
