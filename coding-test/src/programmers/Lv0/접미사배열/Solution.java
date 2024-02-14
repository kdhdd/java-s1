package programmers.Lv0.접미사배열;


import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        String my_string = "banana";
        String[] answer = new String[my_string.length()];

        for (int i=0; i<my_string.length(); i++) {
            String s = "";
            for (int j=i; j<my_string.length(); j++) {
                s += my_string.charAt(j);
            }
            answer[i] = s;
        }

        Arrays.sort(answer);

        System.out.println(Arrays.toString(answer));
    }
}
