package programmers.Lv0.길이에따른연산;

public class Solution {
    public static void main(String[] args) {

        int[] num_list = {2, 3, 4, 5};

        int answer = 0;
        if (num_list.length > 11) {
            for (int i=0; i<num_list.length; i++) {
                answer += num_list[i];
            }
        } else {
            answer = 1;
            for (int i=0; i< num_list.length; i++) {
                answer *= num_list[i];
            }
        }

        System.out.println(answer);
    }
}
