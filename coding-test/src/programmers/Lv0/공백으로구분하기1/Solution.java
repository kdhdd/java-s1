package programmers.Lv0.공백으로구분하기1;

public class Solution {
    public static void main(String[] args) {

        String my_string = "i love you";
        String[] answer = my_string.split(" ");
        for (String s : answer) {
            System.out.println(s);
        }
    }
}
