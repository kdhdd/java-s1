package programmers.Lv0.I로만들기;

public class Solution2 {
    public static void main(String[] args) {

        String myString = "abcdevwxyz";
        String answer = myString.replaceAll("[^l-z]", "l");
        System.out.println(answer);
    }
}
