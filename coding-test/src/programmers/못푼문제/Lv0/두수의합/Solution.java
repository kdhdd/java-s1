package programmers.못푼문제.Lv0.두수의합;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {

        String a = "582";
        String b = "734";

        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger sum = numA.add(numB);

        String answer = sum.toString();

        System.out.println(answer);
    }
}
