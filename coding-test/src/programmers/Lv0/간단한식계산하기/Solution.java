package programmers.Lv0.간단한식계산하기;

public class Solution {
    public static void main(String[] args) {

        String binomial = "43 + 12";
        String[] bin = binomial.split(" ");

        int answer = 0;
        int num1 = Integer.parseInt(bin[0]);
        int num2 = Integer.parseInt(bin[2]);
        if (bin[1].equals("+"))
            answer = num1 + num2;
        else if (bin[1].equals("-"))
            answer = num1 - num2;
        else
            answer = num1 * num2;
        System.out.println(answer);
    }
}
