package programmers.못푼문제.Lv0.특별한이차원배열2_못푼문제;

public class Solution {
    public static void main(String[] args) {

        int[][] arr = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
        int answer = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i])
                    answer = 0;
            }
        }
        System.out.println(answer);
    }
}
