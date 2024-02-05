package programmers.Lv0.A강조하기;

public class Solution {
    public static void main(String[] args) {

        String myString = "PrOgRaMmErS";
        String answer = "";

        answer = myString.toLowerCase().replace("a", "A");

        System.out.println(answer);
    }
}
