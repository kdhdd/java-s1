package programmers.Lv0.부분문자열;

public class Solution {
    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "aabbcc";

        int answer = str2.contains(str1) ? 1 : 0;
        System.out.println(answer);
    }
}
