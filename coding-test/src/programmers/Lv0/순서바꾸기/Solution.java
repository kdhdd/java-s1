package programmers.Lv0.순서바꾸기;

public class Solution {
    public static void main(String[] args) {

        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;
        int[] answer = new int[num_list.length];

        int idx = 0;
        for (int i=n; i<num_list.length; i++) {
            answer[idx++] = num_list[i];
        }
        for (int i=0; i<n; i++) {
            answer[idx++] = num_list[i];
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
}
