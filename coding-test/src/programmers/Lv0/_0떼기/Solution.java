package programmers.Lv0._0떼기;

public class Solution {
    public static void main(String[] args) {

        String n_str = "0010";
        String answer = "";
        int idx = 0;
        for (int i=0; i<n_str.length(); i++) {
            if (n_str.charAt(i) != '0') {
                idx = i;
                break;
            }
        }

        for (int i=idx; i<n_str.length(); i++) {
            char c = n_str.charAt(i);
            String s = Character.toString(c);
            answer += s;
        }

        System.out.println(answer);
    }
}
