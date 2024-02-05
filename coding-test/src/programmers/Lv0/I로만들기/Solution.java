package programmers.Lv0.I로만들기;

public class Solution {
    public static void main(String[] args) {

        String myString = "abcdevwxyz";
        String answer = "";

        for (char c : myString.toCharArray()) {
            int num = (int) c;
            if (num < 108)
                answer += "l";
            else
                answer += ""+c;
        }
        System.out.println(answer);

    }
}
