package programmers.Lv0.가위바위보;

public class Solution {
    public static void main(String[] args) {

        String rsp = "205";

        String answer = "";
        for (char c : rsp.toCharArray()) {
            if (c == '0')
                answer += "5";
            else if (c == '2')
                answer += "0";
            else
                answer += "2";
        }

        System.out.println(answer);
    }
}
