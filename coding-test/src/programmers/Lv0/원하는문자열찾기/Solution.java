package programmers.Lv0.원하는문자열찾기;

public class Solution {
    public static void main(String[] args) {

        String myString = "aaAA";
        String pat = "aaaaa";

        if (myString.toLowerCase().contains(pat.toLowerCase()))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
