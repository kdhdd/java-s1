package programmers.Lv0._2차원으로만들기;

public class Solution {
    public static void main(String[] args) {

        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 2;

        int[][] answer = new int[num_list.length/n][n];

        int idx = 0;
        for (int i = 0; i < num_list.length/n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[idx++];
            }
        }

        for (int[] ints : answer) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}
