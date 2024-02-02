package programmers.Lv0.홀수vs짝수;

public class Solution {
    public static void main(String[] args) {

        int[] num_list = {-1, 2, 5, 6, 3};

        int answer1 = 0;
        int answer2 = 0;
        for (int i=0; i< num_list.length; i++) {
            if (i % 2 == 0)
                answer1 += num_list[i];
            else
                answer2 += num_list[i];
        }

        if (answer1 < answer2)
            answer1 = answer2;
        System.out.println(answer1);
    }
}
