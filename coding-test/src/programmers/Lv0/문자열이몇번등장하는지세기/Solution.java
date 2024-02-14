package programmers.Lv0.문자열이몇번등장하는지세기;

public class Solution {
    public static void main(String[] args) {

        String myString = "banana";
        String pat = "ana";
        int answer = 0;

        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            String str = myString.substring(i, i + pat.length());
            if (str.equals(pat))
                answer++;
        }

        System.out.println(answer);
    }
}
