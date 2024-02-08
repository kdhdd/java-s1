package programmers.Lv1.평균구하기;

public class Solution {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        double answer = (double) sum / arr.length;
        System.out.println(answer);
    }
}
