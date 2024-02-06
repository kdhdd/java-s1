package programmers.Lv0._1로만들기;

public class Solution {
    public static void main(String[] args) {

        int[] num_list = {12, 4, 15, 1, 14};

        int answer = 0;
        for (int i=0; i<num_list.length; i++) {
            while (num_list[i] != 1) {
                if (num_list[i] % 2 == 0) {
                    num_list[i] /= 2;
                    answer++;
                } else {
                    num_list[i] = (num_list[i] - 1) / 2;
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
