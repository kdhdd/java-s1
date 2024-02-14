package programmers.Lv1.짝수와홀수;

public class Solution {
    public static void main(String[] args) {

        int num = 3;
        String answer = "";

        if (num % 2 == 0)
            answer = "Even";
        else
            answer = "Odd";

        System.out.println(answer);
    }
}
