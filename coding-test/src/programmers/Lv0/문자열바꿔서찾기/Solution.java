package programmers.Lv0.문자열바꿔서찾기;

public class Solution {
    public static void main(String[] args) {

        String myString = "ABBAA";
        String pat = "AABB";

        String result = "";
        for (char c : myString.toCharArray()) {
            String s = Character.toString(c);
            if (s.equals("A")) {
                result += "B";
            } else {
                result += "A";
            }
        }

        int answer = 0;
        if (result.contains(pat))
            answer = 1;
        else
            answer = 0;

        System.out.println(answer);
    }
}
