package programmers.Lv0.카운트다운;

import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {

        int start_num = 10;
        int end_num = 3;
//        int[] answer = new int[start_num-end_num+1];
//
//        int idx = 0;
//        for (int i=start_num; i>=end_num; i--) {
//            answer[idx++] = i;
//        }
//        for (int i : answer) {
//            System.out.println(i);
//        }
        int[] answer = IntStream.rangeClosed(-start_num, -end_num).map(i -> -i).toArray();
        for (int i : answer) {
            System.out.println(i);
        }
    }
}
