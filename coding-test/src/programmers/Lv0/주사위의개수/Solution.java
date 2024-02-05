package programmers.Lv0.주사위의개수;

public class Solution {
    public static void main(String[] args) {

        int[] box = {10, 8, 6};
        int n = 3;
        int answer = 1;

        int[] num = new int[3];
        for (int i=0; i< num.length; i++) {
            num[i] = box[i] / n;
        }

        for (int i : num) {
            answer *= i;
        }
        System.out.println(answer);
    }
}
