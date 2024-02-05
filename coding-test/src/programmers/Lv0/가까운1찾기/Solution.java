package programmers.Lv0.가까운1찾기;

public class Solution {
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 0};
        int idx = 3;

        int answer = -1;
        for (int i=idx; i<arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
