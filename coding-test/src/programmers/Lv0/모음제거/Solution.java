package programmers.Lv0.모음제거;

public class Solution {
    public static void main(String[] args) {
        String my_string = "bus";
        my_string = my_string.replace("a", "");
        my_string = my_string.replace("e", "");
        my_string = my_string.replace("i", "");
        my_string = my_string.replace("o", "");
        my_string = my_string.replace("u", "");
        System.out.println(my_string);
    }
}
