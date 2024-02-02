package programmers.Lv0.암호해독;

public class Solution {
    public static void main(String[] args) {

        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        String answer = "";

        for (int i=(code-1); i<cipher.length(); i+=code) {
            char c = cipher.charAt(i);
            answer += Character.toString(c);
        }
        System.out.println(answer);
    }
}
