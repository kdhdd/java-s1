package programmers.Lv0.특정문자열로끝나는가장긴부분문자열찾기;

public class Solution {
    public static void main(String[] args) {

        String myString = "AbCdEFG";
        String pat = "dE";

        int end = myString.lastIndexOf(pat);
        myString = myString.substring(0, end + pat.length());
        System.out.println(myString);
    }
}
