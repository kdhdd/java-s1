package programmers.Lv0.배열만들기3;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1, 3}, {0, 4}};

        List<Integer> list = new ArrayList<>();
        for (int i=0; i<intervals.length; i++) {
            for (int j=intervals[i][0]; j<=intervals[i][1]; j++) {
                list.add(arr[j]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i=0; i< answer.length; i++) {
            answer[i] = list.get(i);
        }
    }
}
