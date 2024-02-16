package programmers.못푼문제.Lv0.모스부호1;

public class Solution {
    public static void main(String[] args) {

        String letter = ".... . .-.. .-.. ---";
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.","---",".--.",
                "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String[] letterArr = letter.split("\\s+");
        for (String s : letterArr) {
            for (int i = 0; i < morse.length; i++) {
                if (s.equals(morse[i]))
                    answer += Character.toString(i + 'a');
            }
        }
        System.out.println(answer);
    }
}
