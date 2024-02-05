package programmers.Lv0.정수찾기;

public class Solution {
    public static void main(String[] args) {

        int[] num_list = {15, 98, 23, 2, 15};
        int n = 20;

        int answer = 0;
        for (int i : num_list) {
            if (i == n) {
                answer = 1;
                break;
            }
        }
        System.out.println(answer);
    }
}
