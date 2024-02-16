package programmers.Lv0.이진수더하기;

public class Solution {
    public static void main(String[] args) {

        String bin1 = "10";
        String bin2 = "11";
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int res = num1+num2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(res);
        String answer = Integer.toBinaryString(res);
        System.out.println(answer);
    }
}
