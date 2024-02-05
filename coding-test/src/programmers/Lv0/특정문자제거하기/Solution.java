package programmers.Lv0.특정문자제거하기;

public class Solution {
    public static void main(String[] args) {

        String my_string = "abcdef";
        String letter = "f";

        String answer = my_string.replace(letter, "");
        System.out.println(answer);
    }
}
